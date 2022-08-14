package prac3;

import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Test3[]op=new Test3[2];
		
		for(int i=0; i<op.length;i++) {
			op[i]=new Test3();
			op[i].input();
			op[i].setProcess();
			int cnt =op[i].getQty()+Sales.getCnt();
			Sales.setCnt(cnt);
			
		}
		// 할인율 입력
		System.out.println("할인율:");
		Sales.setDiscount(sc.nextDouble());
		
		//출력 
		System.out.println("[[판매가]]");
		for(int i=0; i<op.length;i++) {
			op[i].getDisplay();
		}
		System.out.println("판매건수 :"+ Sales.getCnt());
	}

}
