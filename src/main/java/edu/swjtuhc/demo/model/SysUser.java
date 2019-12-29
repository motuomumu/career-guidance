package edu.swjtuhc.demo.model;

public class SysUser {
	int UID;
	private String username;
	private String password;
	private String region;
	private String role;
	
	public int getUID() {
		return UID;
	}
	public void setUID(int uID) {
		UID = uID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "SysUser [username=" + username + ", password=" + password + ", region=" + region + ", role=" + role
				+ ", UID=" + UID + "]";
	}
	
}
