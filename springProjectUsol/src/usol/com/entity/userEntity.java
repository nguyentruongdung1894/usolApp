package usol.com.entity;

public class userEntity {
	private int userID;
	private String userName;
	private String password;
	private boolean role;

	public userEntity() {
		super();
	}

	public userEntity(int userID, String userName, String password, boolean role) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.password = password;
		this.role = role;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isRole() {
		return role;
	}

	public void setRole(boolean role) {
		this.role = role;
	}

}
