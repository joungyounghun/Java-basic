package prac4;

import java.util.Scanner;

public class Customerlmpl {
	Scanner sc = new Scanner(System.in);
	CustomerVO[] list = new CustomerVO[10];
	int listCnt=0;
	String name;
	
	void input() {
	      if(listCnt < 10) {
	         list[listCnt] = new CustomerVO();
	         System.out.print("고객번호 : ");
	         list[listCnt].setNum(sc.next());
	         System.out.print("이  름 : ");
	         list[listCnt].setName(sc.next());
	         System.out.print("전화번호 : ");
	         list[listCnt].setTel(sc.next());
	         
	         listCnt++;
	      }else {
	         System.out.println("입력 가능 인원은 10명까지 입니다.");
	      }
	   }
	void output_title() {
		System.out.println("고객번호\t이름\t전화번호");
	}
	void output() {
		output_title();
		 for(int i=0; i<listCnt; i++) {
			 System.out.println(list[i].toString());
	     }
	 }
	void fix () {
		System.out.print("수정할 이름? : ");
		name=sc.next();
		
		int flag = -1;
		for(int i=0; i<listCnt;i++) {
		   if (name.equals(list[i].getName())) {
		   output_title();
		   System.out.println(list[i].toString());
		   System.out.println();
	
			     System.out.print("고객번호 : ");
		         list[i].setNum(sc.next());
		         System.out.print("이  름 : ");
		         list[i].setName(sc.next());
		         System.out.print("전화번호 : ");
		         list[i].setTel(sc.next());
		         
		         flag =0;
		         break;
		         
		   }
	}
	if(flag ==-1) {
		System.out.println(name+"님은 고객 목록에 없습니다.");
	}
	
	}

	void search() {
		System.out.println("검색할 이름?");
		name=sc.next();
		
		int flag = -1;
		output_title();
		for(int i=0; i<10;i++) {
	         if(name == list[i].getNum()) {
	            System.out.println(list[i].toString());
	            
	            flag=0;
	            break;
	         }
		}
	    if(flag ==-1) {
	    	System.out.println(name+"님은 고객 목록에 없습니다.");

		
			}
		}
	}
