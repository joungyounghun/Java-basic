import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int b=0, C=0;
		
		System.out.printf("1~100 사이의 배수를 구할 숫자 입력:");
		C=sc.nextInt();
		for(int i=1; i<=100;i++) {
			if(i%C == 0) {
				b++ ;
		
			System.out.println(i);
			}
		}
		System.out.println("1~100사이의 7의 배수 개수 ="+b);
	}

}
