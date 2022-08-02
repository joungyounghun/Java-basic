import java.util.Scanner;
public class Exam6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("정수입력: ");
		int num1 = sc.nextInt();
		System.out.println("정수입력: ");
		int num2 = sc.nextInt();
		
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 <= num2);
		
	}

}
