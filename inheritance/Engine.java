package com.jse.inheritance;

import java.util.Scanner;

public class Engine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("0.Exit 1.Go");
			switch(scanner.nextInt()) {
			case 0: return;
			case 1: break;
			}
		}
	}
}
