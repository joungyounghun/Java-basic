import java.util.Scanner;

public class Practice1 {
	
	static int input() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		return a;
	}
	static boolean doubleNum(int x , int y) {
		if(x%y == 0)
			return true;
		else
			return false;
		
	}
	static void output(int a ,int b) {
		if(doubleNum(a,b))
			System.out.print(a + "은 "+ b + "의 배수 입니다.");
			
		else
			System.out.print(a + "은 "+ b + "의 배수가 아닙니다.");
			
		
	}
	public static void main(String[] args) {
		
		//선언
		int a,b;
		//입력
		a =input();
		b =input();
		//연산 및 출력
		output(a,b);
	}

}

/*
static void output(int x,int y ) {
if(doubleNum(x,y))
   System.out.println(x+"(은)는"+y+"의 배수입니다.");
else
   System.out.println(x+"(은)는"+y+"의 배수가 아닙니다.");
}
*/