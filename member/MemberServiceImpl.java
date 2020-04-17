package com.jse.member;

public class MemberServiceImpl implements MemberService {
	private Member[] members;
	private int count;

	public MemberServiceImpl() {
		members = new Member[5];
		count = 0;
	}

	@Override
	public void add(Member member) {
		System.out.println("서비스로 들어온 멤버");
		System.out.println(member);
		members[count] = member;
		count++;
	}

	@Override
	public Member[] list() {
		return members;
	}

	@Override
	public Member[] searchByName(String name) {
		Member[] returnMembers = null;
		int searchCount = count(name);
		if(searchCount != 0) {
			returnMembers = new Member[searchCount];
			int j = 0;
			for (int i = 0; i < count; i++) {
				if (name.equals(members[i].getName())) {
					returnMembers[j] = members[i];
					j++;
					if(searchCount == j) {
						break;
					}
				}
			}
		}
		
		return returnMembers;
	}

	@Override
	public Member[] searchByGender(String gender) {
		Member[] returnMembers = new Member[count];
		for (int i =0; i < count; i++) {
			if (gender == "남자") {
				char ch = members[i].getSsn().charAt(7);
				switch(ch) {
				case '1' : case '3' : returnMembers[i] = members[i]; break;
				}
			}else if(gender == "여자") {
				char ch = members[i].getSsn().charAt(7);
				switch(ch) {
				case '2' : case '4' : returnMembers[i] = members[i]; break;
				}
			}
		}
		return returnMembers;
	}

	@Override
	public Member detail(String userid) {
		Member returnMember = null;
		for (int i = 0; i < count; i++) {
			if (userid.equals(members[i].getUserid())) {
				returnMember = new Member();
				returnMember = members[i];
				break;
			}
		}
		return returnMember;
	}

	@Override
	public int count() {
		return count;
	}

	@Override
	public int count(String name) {
		int returnCount = 0;
		for (int i = 0; i < count; i++) {
			if(name.equals(members[i].getName())) {
				returnCount++;
			}
		}
		return returnCount;
	}

	@Override
	public Member login(Member member) {
		Member returnMember = null;
		for (int i = 0; i < count; i++) {
			if (member.getUserid().equals(members[i].getUserid())
					&& member.getPasswd().equals(members[i].getPasswd())) {
				returnMember = members[i];
				break;
			}
		}
		return returnMember;
	}

	@Override
	public void update(Member member) {
		for (int i = 0; i < count; i++) {
			if (member.getUserid().equals(members[i].getUserid())) {
				members[i].setPasswd(member.getPasswd());
				break;
			}
		}
	}

	@Override
	public void delete(Member member) {
		for (int i = 0; i < count; i++) {
			if (member.getUserid().equals(members[i].getUserid()) && member.getPasswd().equals(members[i].getPasswd())) {
				members[i] = members[count-1];
				members[count-1] = null;
				count--;
			}
		}
	}

}
