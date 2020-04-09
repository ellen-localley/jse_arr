package com.jse.member;

public class MemberBean {
	private String name;
	private String userid;
	private String passwd;
	private int age;
	
	public MemberBean(String name,String userid,String passwd,int age) {
		this.name=name;
		this.userid=userid;
		this.passwd=passwd;
		this.age=age;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setUserid(String userid) {
		this.userid=userid;
	}
	
	public String getUserid() {
		return userid;
	}
	
	public void setPasswd(String passwd) {
		this.passwd=passwd;
	}
	
	public String getPasswd() {
		return passwd;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
	
	
}