import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a;
		double b;
		String math;
		
		System.out.print("첫번째 수 입력:");
		a =sc.nextDouble();
		System.out.print("첫번째 수 입력:");
		b =sc.nextDouble();
		System.out.print("연산자 입력:");
		math =sc.next();
		
		switch(math) {
		
		case "+": System.out.print(a+b); break;
		case "-": System.out.print(a-b); break;
		case "*": System.out.print(a*b); break;
		case "/": System.out.print(a/b); break;
		default:  break;
		}
		sc.close();
		
	}

}

/*
import java.util.Scanner;

public class Practice1 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double num1=0, num2=0, result=0;
      String s="";
      
      // 입력
      System.out.print("첫 번째 수 : ");
      num1 = sc.nextDouble();
      System.out.print("두 번째 수 : ");
      num2 = sc.nextDouble();
      System.out.print("연산자 : ");
      s = sc.next();
      
      // switch
      switch(s) {
      case "+": result = num1 + num2; break;
      case "-": result = num1 - num2; break;
      case "*": result = num1 * num2; break;
      case "/": result = num1 / num2; break;
      }
      
      // 출력
       if (S.equals("e")){
       	System.out.println("연산자 입력이 잘못되었습니다. 연산자(--);
       	}else{
       		Syetem.out.printf("%s %S %S =%s", num1,s,num2,result
*/
