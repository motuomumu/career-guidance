package edu.swjtuhc.demo.model;

public class SysUser {
	private String username;
	private String password;
	private String name;
	private int age;
	private String gender;
	private int uid;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	@Override
	public String toString() {
		return "SysUser [username=" + username + ", password=" + password + ", name=" + name + ", age=" + age
				+ ", gender=" + gender + ", uid=" + uid + "]";
	}
	
}
