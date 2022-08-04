import java.util.Scanner;

public class Practice4 {
	static double input_num (String str) {
		Scanner sc=new Scanner(System.in);
		System.out.print(str+"첫번째 수 : ");
		double num =sc.nextDouble();
		return num;
	}
	static String input_op() {
		Scanner sc=new Scanner(System.in);
		System.out.print("연산자 : ");
        String op= sc.next();
        return op;
	}
	static double calc(String op,double num1,double num2) {
		double = result=0;
		switch(op) {
		 case '+': return num1+num2;
         case '-': return num1-num2;
         case '*': return num1*num2;
         case '/': return num1/num2;
	}
		return result;
	}
	
	 System.out.printf("%s %s %s = %s", num1, op, num2, result);
	static String output
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1=0, num2=0, result=0;
        String s="";
        
        // 입력
        num1=input_num("첫");
        num2=input_num("두");
        s= input_op();
        // switch         
       switch(s) {
       case "+": result = num1 + num2; break;
       case "-": result = num1 - num2; break;
       case "*": result = num1 * num2; break;
       case "/": result = num1 / num2; break;         
       }         
        
        // 출력
        System.out.printf("%s %s %s = %s", num1, op, num2, result);                  
  }