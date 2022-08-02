/*
 import java.util.Scanner;
 


public class Practice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		String gender;
		int age;
		double height;
		
		
		
		System.out.println("lnput name:");
		name = sc.next();
		System.out.println("lnput gender:");
		gender = sc.next();
		System.out.println("lnput age:");
		age = sc.nextInt();
		System.out.println("lnput height:");
		height = sc.nextInt();
		
		System.out.println("lnput name:");
		
		
		
		
		
		
	}

}
*/

import java.util.Scanner;
public class Practice2 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      String name="";
      char gender=0;
      int age=0;
      double height=0;
      String result="";
      
      System.out.println("Input name: ");
      name=sc.next();
      System.out.println("Input gender: ");
      gender=sc.next().charAt(0);
      System.out.println("Input age: ");
      age=sc.nextInt();
      System.out.println("Input height: ");
      height=sc.nextDouble();
      
      // 삼차 연산항    젠더가 엠일 때 남자 아니면여자 
      result=(gender=='M')? "남자":"여자 ";
      
      
      System.out.println("이름: "+name);
      System.out.println("성별: "+result);
      System.out.println("나이: "+age+"세");
      System.out.println("신장: "+height+"cm");
      
      
   }

}