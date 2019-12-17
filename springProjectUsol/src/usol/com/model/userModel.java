package usol.com.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import usol.com.connectDB.connectSqlServer;
import usol.com.entity.userEntity;

public class userModel {
	public boolean loginUser(String userName, String password) {
		boolean check = false;
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql = "select Role from tblUser where UserName = ? and Password = ?";
		try {
			conn = connectSqlServer.getConnectionSqlServer();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, userName);
			pstm.setString(2, password);
			rs = pstm.executeQuery();
			while(rs.next()) {
				check = rs.getBoolean("Role");
			}		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return check;
	}

	public List<userEntity> getAllUser() {
		List<userEntity> list = new ArrayList<userEntity>();
		Connection conn = null;
		Statement stm = null;
		ResultSet rs = null;
		String sql = "select * from tblUser";
		try {
			conn = connectSqlServer.getConnectionSqlServer();
			stm = conn.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				userEntity uEntity = new userEntity();
				uEntity.setUserID(rs.getInt("UserID"));
				uEntity.setUserName(rs.getString("UserName"));
				uEntity.setPassword(rs.getString("Password"));
				uEntity.setRole(rs.getBoolean("Role"));
				list.add(uEntity);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}

	public boolean insertUser(String userName, String password, boolean role) {
		boolean check = false;
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "insert into tblUser values (?,?,?)";
		try {
			conn = connectSqlServer.getConnectionSqlServer();
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userName);
			pstm.setString(2, password);
			pstm.setBoolean(3, role);
			int count = pstm.executeUpdate();
			if (count != 0) {
				check = true;
			} else {
				check = false;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return check;
	}

	public userEntity getUserById(int id) {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql = "select * from tblUser where UserID = ?";
		userEntity uEntity = new userEntity();
		try {
			conn = connectSqlServer.getConnectionSqlServer();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			rs = pstm.executeQuery();
			while (rs.next()) {
				uEntity.setUserID(rs.getInt("UserID"));
				uEntity.setUserName(rs.getString("UserName"));
				uEntity.setPassword(rs.getString("Password"));
				uEntity.setRole(rs.getBoolean("Role"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return uEntity;
	}

	public boolean updateUser(userEntity uEntity) {
		Connection conn = connectSqlServer.getConnectionSqlServer();
		PreparedStatement pst = null;
		String sql = " update tblUser set UserName = ?, Password = ?, Role = ? where  UserID = ?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, uEntity.getUserName());
			pst.setString(2, uEntity.getPassword());
			pst.setBoolean(3, uEntity.isRole());
			pst.setInt(4, uEntity.getUserID());
			pst.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean deleteUser(userEntity uEntity) {
		Connection conn = connectSqlServer.getConnectionSqlServer();
		PreparedStatement pst = null;
		String sql = " update tblUser set UserName = ?, Password = ?, Role = ? where  UserID = ?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, uEntity.getUserName());
			pst.setString(2, uEntity.getPassword());
			pst.setBoolean(3, uEntity.isRole());
			pst.setInt(4, uEntity.getUserID());
			pst.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		return true;
	}
//	public static void main(String[] args) {
//		userModel u = new userModel();
//		boolean check = u.loginUser("admin", "admin");
//		System.out.println(check);
//	}
}
