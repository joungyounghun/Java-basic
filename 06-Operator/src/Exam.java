import java.util.Scanner;
public class Exam {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int num1,num2;
		
		System.out.println("정수 입력");
		num1=sc.nextInt();
		System.out.println("정수 입력");
		num2=sc.nextInt();
		
		System.out.println(num1 +"+"+num2+"="+(num1+num2));
		System.out.println(num1 +"-"+num2+"="+(num1-num2));
		System.out.println(num1 +"*"+num2+"="+(num1*num2));
		System.out.println(num1 +"/"+num2+"="+(num1/num2));
		System.out.println(num1 +"%"+num2+"="+(num1%num2));
		
		
	}

}
