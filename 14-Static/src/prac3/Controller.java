package prac3;

import java.util.Scanner;

import prac4.CustomerVO;

public class Controller {
   Scanner sc = new Scanner(System.in);
   EmpVO[] list = new EmpVO[5];
   int listCnt = 0;
   //입력
   void input() {
      if(listCnt < 5) {
         list[listCnt] = new EmpVO();
         System.out.print("이름 : ");
         list[listCnt].setName(sc.next());
         System.out.print("연봉 : ");
         list[listCnt].setSalary(sc.nextInt());
         System.out.print("부서명 : ");
         list[listCnt].setDepartment(sc.next());
         
         listCnt++;
      }else {
         System.out.println("입력 가능 인원은 5명까지 입니다.");
      }
   }
   // 출력
   void output() {
      for(int i=0; i<listCnt; i++) {
         System.out.println(list[i].toString());
  }
  }
  
	   	
 }
      
   
