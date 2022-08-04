import java.util.Scanner;

public class Practice5 {
	static int input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~100 사이의 배수를 구할 숫자 입력: ");
	      int num = scanner.nextInt();
	      return num;
	}
	static int output1(int num) {
		int cnt=0;
		for(int i=1;i<=100;i++) {
		   if(i%num==0) {
		      System.out.printf("%d ",i);
		      cnt++;
		   }
		}
		return cnt;	
	}
	static void output2(int num,int cnt) {
		System.out.println();
		System.out.printf("\n1~100 사이의 %d의 배수 개수 : %d",num,cnt);
		}

	public static void main(String[] args) { 
		   int num=0,cnt=0;

		   num=input();
		   cnt=output1(num);
		   output2(num,cnt);
	}
}

