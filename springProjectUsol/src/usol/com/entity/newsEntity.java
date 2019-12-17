package usol.com.entity;

import java.sql.Date;

public class newsEntity {
	private int newsID;
	private String newsName;
	private String description;
	private String detail;
	private String image;
	private Date date;
	private int categoryID;
	private int userID;
	private boolean status;

	public newsEntity() {
		super();
	}

	public newsEntity(String newsName, String description, String detail, String image, Date date, int categoryID,
			int userID, boolean status) {
		super();
		this.newsName = newsName;
		this.description = description;
		this.detail = detail;
		this.image = image;
		this.date = date;
		this.categoryID = categoryID;
		this.userID = userID;
		this.status = status;
	}

	public newsEntity(int newsID, String newsName, String description, String detail, String image, Date date,
			int categoryID, int userID, boolean status) {
		super();
		this.newsID = newsID;
		this.newsName = newsName;
		this.description = description;
		this.detail = detail;
		this.image = image;
		this.date = date;
		this.categoryID = categoryID;
		this.userID = userID;
		this.status = status;
	}

	public int getNewsID() {
		return newsID;
	}

	public void setNewsID(int newsID) {
		this.newsID = newsID;
	}

	public String getNewsName() {
		return newsName;
	}

	public void setNewsName(String newsName) {
		this.newsName = newsName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
