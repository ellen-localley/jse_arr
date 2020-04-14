package com.jse.member2;

public class MemberServiceImpl implements MemberService{
	private Member[] members;
	private int count;

	public MemberServiceImpl() {
		members = new Member[5];
		count = 0;
	}
	
	@Override
	public void setMembers(Member[] members) {
		this.members = members;
	}

	@Override
	public Member[] getMembers() {
		return members;
	}

	@Override
	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public int getCount() {
		return count;
	}

	@Override
	public void add(Member member) {
		members[count] = member;
		count++;
	}

	@Override
	public Member login(Member member) {
		// TODO Auto-generated method stub
		return null;
	}

}
