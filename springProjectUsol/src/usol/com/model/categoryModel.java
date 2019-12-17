package usol.com.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import usol.com.connectDB.connectSqlServer;
import usol.com.entity.categoryEntity;

public class categoryModel {
	public List<categoryEntity> getAllCategory() {
		List<categoryEntity> list = new ArrayList<categoryEntity>();
		Connection conn = null;
		Statement stm = null;
		ResultSet rs = null;
		String sql = "select * from tblCategory";
		try {
			conn = connectSqlServer.getConnectionSqlServer();
			stm = conn.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				categoryEntity cEntity = new categoryEntity();
				cEntity.setCategoryID(rs.getInt("CategoryID"));
				cEntity.setCategoryName(rs.getString("CategoryName"));
				cEntity.setDescription(rs.getString("Description"));
				cEntity.setStatus(rs.getBoolean("Status"));
				list.add(cEntity);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}

	public boolean insertCategory(String categoryName, String description, boolean status) {
		boolean check = false;
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "insert into tblCategory values (?,?,?)";
		try {
			conn = connectSqlServer.getConnectionSqlServer();
			pstm = conn.prepareStatement(query);
			pstm.setString(1, categoryName);
			pstm.setString(2, description);
			pstm.setBoolean(3, status);
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

	public categoryEntity getCategoryById(int id) {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql = "select * from tblCategory where CategoryID = ?";
		categoryEntity cEntity = new categoryEntity();
		try {
			conn = connectSqlServer.getConnectionSqlServer();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			rs = pstm.executeQuery();
			while (rs.next()) {
				cEntity.setCategoryID(rs.getInt("CategoryID"));
				cEntity.setCategoryName(rs.getString("CategoryName"));
				cEntity.setDescription(rs.getString("Description"));
				cEntity.setStatus(rs.getBoolean("Status"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return cEntity;
	}

	public boolean updateCategory(categoryEntity cEntity) {
		boolean check = false;
		Connection conn = connectSqlServer.getConnectionSqlServer();
		PreparedStatement pst = null;
		String sql = " update tblCategory set CategoryName = ?, Description = ?, Status = ? where  CategoryID = ?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, cEntity.getCategoryName());
			pst.setString(2, cEntity.getDescription());
			pst.setBoolean(3, cEntity.isStatus());
			pst.setInt(4, cEntity.getCategoryID());
			int count = pst.executeUpdate();
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

	public boolean deleteCategory(categoryEntity cEntity) {
		boolean check = false;
		Connection conn = connectSqlServer.getConnectionSqlServer();
		PreparedStatement pst = null;
		String sql = " update tblCategory set CategoryName = ?, Description = ?, Status = ? where  CategoryID = ?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, cEntity.getCategoryName());
			pst.setString(2, cEntity.getDescription());
			pst.setBoolean(3, cEntity.isStatus());
			pst.setInt(4, cEntity.getCategoryID());
			int count = pst.executeUpdate();
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
}
