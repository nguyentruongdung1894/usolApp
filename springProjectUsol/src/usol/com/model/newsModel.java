package usol.com.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import usol.com.connectDB.connectSqlServer;
import usol.com.entity.newsEntity;

public class newsModel {
	public List<newsEntity> getAllNews() {
		List<newsEntity> list = new ArrayList<newsEntity>();
		Connection conn = null;
		Statement stm = null;
		ResultSet rs = null;
		String sql = "select * from tblNews";
		try {
			conn = connectSqlServer.getConnectionSqlServer();
			stm = conn.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				newsEntity nEntity = new newsEntity();
				nEntity.setNewsID(rs.getInt("NewsID"));
				nEntity.setNewsName(rs.getString("NewsName"));
				nEntity.setDescription(rs.getString("Description"));
				nEntity.setDetail(rs.getString("Detail"));
				nEntity.setImage(rs.getString("Image"));
				nEntity.setDate(rs.getDate("Date"));
				nEntity.setCategoryID(rs.getInt("CategoryID"));
				nEntity.setUserID(rs.getInt("UserID"));
				nEntity.setStatus(rs.getBoolean("Status"));
				list.add(nEntity);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}

	public boolean insertNews(newsEntity nEntity) {
		boolean check = false;
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "insert into tblNews values (?,?,?,?,?,?,?,?)";
		try {
			conn = connectSqlServer.getConnectionSqlServer();
			pstm = conn.prepareStatement(query);
			pstm.setString(1, nEntity.getNewsName());
			pstm.setString(2, nEntity.getDescription());
			pstm.setString(3, nEntity.getDetail());
			pstm.setString(4, nEntity.getImage());
			pstm.setDate(5, nEntity.getDate());
			pstm.setInt(6, nEntity.getCategoryID());
			pstm.setInt(7, nEntity.getUserID());
			pstm.setBoolean(8, nEntity.isStatus());
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

	public newsEntity getNewsById(int id) {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql = "select * from tblNews where NewsID = ?";
		newsEntity nEntity = new newsEntity();
		try {
			conn = connectSqlServer.getConnectionSqlServer();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			rs = pstm.executeQuery();
			while (rs.next()) {
				nEntity.setNewsID(rs.getInt("NewsID"));
				nEntity.setNewsName(rs.getString("NewsName"));
				nEntity.setDescription(rs.getString("Description"));
				nEntity.setDetail(rs.getString("Detail"));
				nEntity.setImage(rs.getString("Image"));
				nEntity.setDate(rs.getDate("Date"));
				nEntity.setCategoryID(rs.getInt("CategoryID"));
				nEntity.setUserID(rs.getInt("UserID"));
				nEntity.setStatus(rs.getBoolean("Status"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return nEntity;
	}

	public boolean updateNews(newsEntity nEntity) {
		boolean check = false;
		Connection conn = connectSqlServer.getConnectionSqlServer();
		PreparedStatement pst = null;
		String sql = "update tblNews set NewsName = ?, Description = ?, Detail = ?,Image=?,Date=?,CategoryID=?,UserID=?,Status=? where  NewsID = ?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, nEntity.getNewsName());
			pst.setString(2, nEntity.getDescription());
			pst.setString(3, nEntity.getDetail());
			pst.setString(4, nEntity.getImage());
			pst.setDate(5, nEntity.getDate());
			pst.setInt(6, nEntity.getCategoryID());
			pst.setInt(7, nEntity.getUserID());
			pst.setBoolean(8, nEntity.isStatus());
			pst.setInt(9, nEntity.getNewsID());
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

	public boolean deleteNews(newsEntity nEntity) {
		boolean check = false;
		Connection conn = connectSqlServer.getConnectionSqlServer();
		PreparedStatement pst = null;
		String sql = "update tblNews set NewsName = ?, Description = ?, Detail = ?,Image=?,Date=?,CategoryID=?,UserID=?,Status=? where  NewsID = ?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, nEntity.getNewsName());
			pst.setString(2, nEntity.getDescription());
			pst.setString(3, nEntity.getDetail());
			pst.setString(4, nEntity.getImage());
			pst.setDate(5, nEntity.getDate());
			pst.setInt(6, nEntity.getCategoryID());
			pst.setInt(7, nEntity.getUserID());
			pst.setBoolean(8, nEntity.isStatus());
			pst.setInt(9, nEntity.getNewsID());
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
