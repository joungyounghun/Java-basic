package prac3;

import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=0;
		Controller c1=new Controller();
		
		while(true) {
			System.out.println("1.입력");
			System.out.println("2.출력");
			System.out.println("3.종료");
			System.out.println("-----");
			System.out.print("번호 입력: ");
			num=sc.nextInt();
			
			switch(num) {
			case 1:
				c1.input();
				break;
			case 2:
				c1.output();
				break;
			case 3:
				System.out.println("프로그램 종료");
				System.exit(0);
			}
				
			System.out.println();
		}
	}
}