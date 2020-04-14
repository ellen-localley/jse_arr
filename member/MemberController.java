package com.jse.member;
import javax.swing.JOptionPane;
import com.jse.util.Constants;
public class MemberController {
	public static void main(String[] args) {
		MemberService memberService = new MemberServiceImpl();
		Member member = new Member();
//		String message = "";
		String[] values;
		while (true) {
			switch (JOptionPane.showInputDialog(Constants.MEMBER_MENU)) {
			case "0":
				return;
			case "1":
				values = JOptionPane.showInputDialog(Constants.MEMBER_INPUT).split(",");
				member.setName(values[0]);
				member.setUserid(values[1]);
				member.setPasswd(values[2]);
//				member.setAge(Integer.parseInt(values[3]));
				memberService.add(member);
				break;
			case "2":
//				message = "";
				
				values = JOptionPane.showInputDialog(Constants.MEMBER_LOGIN).split(",");
//				member.getReturnId(values[0]);
//				member.setReturnPasswd(values[1]);
//				
//				if (member.getUserid() == member.getReturnId()) {
//					if(member.getPasswd() == member.getReturnPasswd()) {
//						message = "로그인 성공";
//					}else if(member.getPasswd() != member.getReturnPasswd()){
//						message = "로그인 실패";
//					}
//				} else {
//					message = "로그인 실패";
//				}
//				JOptionPane.showMessageDialog(null, message);
				break;
			}
		}
	}
}






