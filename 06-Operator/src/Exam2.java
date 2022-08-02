
public class Exam2 {
	public static void main(String[]args) {
		//정수의 나눗셈
		int a=7;
		int b=3;
		int r1=a/b;
		System.out.println("7 / 3 = "+ r1);
		System.out.println("--------------");
		//실수의 나눗셈
		double c=7;
		double d=3;
		double r2=c /d;
		System.out.println("7 / 3 = "+ r2);
		System.out.println("--------------");
		//정수와 실수의 나눗셈
		double r3=a /d;
		System.out.println("7 / 3 = "+ r3);
		System.out.println("--------------");
		
		//0으로 나누기
		//System.out.println(100/0); // 정수 0으로 나누면 에러가 납니다
		System.out.println(100/0.0);
		
		double dd = 1234567890123456789L;
		System.out.println(dd);
	}

}
