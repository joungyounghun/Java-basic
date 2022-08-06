import java.util.Scanner;

// 더하기 기능의 프로그램을 클래스로 만듦
class BBB {
	Scanner sc=new Scanner(System.in);
	//선언
	int a,b,c; // 맴버 변수
	
	//입력
	void input() {
		System.out.println("정수 입력:");
		a= sc.nextInt();
		System.out.println("정수 입력:");
		b= sc.nextInt();
		
	}
	//연산
	void puls() {
		c= a+b ;
	}
	
	
	//출력
	void output () {
		System.out.printf("%d +%d =%d\n",a,b,c);
	}
	
}
public class Test2 {
	public static void main(String[] args) {
		//선언
		BBB bb = new BBB();
		//입력
		bb.input();
		//연산
		bb.puls();
		//출력
		bb.output();
		
	}

}
