package com.jse.member;

public class MemberServiceImpl implements MemberService {
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
	public void add(Member member) {
		System.out.println("서비스로 들어온 멤버");
		System.out.println(member);
		members[count] = member;
		count++;
	}

	@Override
	public Member login(Member member) {
		Member returnMember = null;
		for(int i=0; i< members.length; i++) {
			if(member.getUserid().equals(members[i].getUserid())
				&& member.getPasswd().equals(members[i].getPasswd())) {
				returnMember = new Member();
				returnMember = members[i];
				break;
			}
		}
		return returnMember;
	}

}
