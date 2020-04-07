package com.jse.swing;

public class MemberService {
	private MemberBean[] members;
	private int count;
	
	public MemberService() {
		members=new MemberBean[3];
		count=0;
	}
	
	public void setMembers(MemberBean[] members) {
		this.members=members;
	}
	
	public MemberBean[] getMembers() {
		return members;
	}
	
	public void setCount(int count) {
		this.count=count;
	}
	
	public int getCount() {
		return count;
	}
	
	public void add(MemberBean member) {
		members[count]=member;
		count++;
	}
}
