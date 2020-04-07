package com.jse.swing;

import java.util.Scanner;

public class Engine {

// "[%s : 총점 %d 점, 평균 %d 점,학점 : %s]"

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GradeService gradeService = new GradeService();
		MemberService memberService = new MemberService();
		ItemService itemService = new ItemService();

		while (true) {
			System.out.println("0.종료   1.성적표입력   2.성적표출력   3.성적순위   4.회원가입   5.회원목록"
					+ "  6.상품입력   7.상품목록");
			switch (scanner.nextInt()) {
			case 0:
				System.out.println("종료");
				return;
			case 1:
				System.out.println("성적표입력");
				for (int i = 0; i < 3; i++) {
					System.out.println("이름,국어,영어,수학 입력");
					gradeService.add(
							new GradeBean(
									scanner.next(), 
									scanner.nextInt(), 
									scanner.nextInt(), 
									scanner.nextInt()));
				}
				break;

			case 2:
				GradeBean[] grades=gradeService.getGrades();
				for (int i = 0; i < 3; i++) {
					System.out.println(String.format("[%s : 총점 %d 점, 평균 %d 점,학점 : %s]", 
							grades[i].getName(),
							grades[i].sum(), 
							grades[i].avg(), 
							grades[i].grade()));
				}
				break;

			case 3:
				break;

			case 4:
				System.out.println("회원가입");
				for (int i = 0; i < 3; i++) {
					System.out.println("이름,아이디,패스워드,나이 입력");
					memberService.add(new MemberBean(
							scanner.next(), 
							scanner.next(), 
							scanner.next(), 
							scanner.nextInt()));
				}
				break;

			case 5:
				MemberBean[] members=memberService.getMembers();
				System.out.println("회원목록");
				for (int i = 0; i < 3; i++) {
					System.out.println(String.format("이름: %s, ID: %s", 
							members[i].getName(), 
							members[i].getUserid()));
				}
				break;
				
			case 6:
				System.out.println("상품입력");
				for(int i=0;i<3;i++) {
					System.out.println("상품명,가격,색상 입력");
					itemService.add(new ItemBean(
							scanner.next(),
							scanner.nextInt(),
							scanner.next()));
				}
				break;
				
			case 7:
				ItemBean[] items=itemService.getItems();
				System.out.println("상품목록");
				for(int i=0;i<3;i++) {
					System.out.println(String.format("상품명: %s, 가격: %d, 색상: %s", 
							items[i].getName(),
							items[i].getPrice(),
							items[i].getColor()));
				}
				break;
				
			}
		}
	}

	public static GradeBean input(Scanner scanner) {
		System.out.println("이름,국어,영어,수학 입력");
		return new GradeBean(scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
	}

	public static MemberBean join(Scanner scanner) {
		System.out.println("이름,아이디,패스워드,나이 입력");
		return new MemberBean(scanner.next(), scanner.next(), scanner.next(), scanner.nextInt());

	}

}
