import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		System.out.print("첫번째 수 입력: ");
		int one =sc.nextInt();
		System.out.print("두번째 수 입력: ");
		int two =sc.nextInt();
		
		if (one < two) {
			System.out.print("첫번째 수( "+one+" )가 두번째 수( "+two+" )보다 작은수 입니다.");
		}else if(one > two) {
			System.out.print("첫번째 수( "+one+" )가 두번째 수( "+two+" )보다 큰 수 입니다.");
		}else  {
			System.out.print("첫번째 수( "+one+" )가 두번째 수( "+two+" )와 같은수  입니다.");
			
		}
		
		
				
				
	}

}

// 프린트 f 를 쓰면  %d %d 를 한후 마지막에 one , two 이렇게 쓸수있다


/*
Scanner sc = new Scanner(System.in);

System.out.println("첫 번째 수 = ");
int a = sc.nextInt();
System.out.println("두 번째 수 = ");
int b = sc.nextInt();

if(a == b){
   System.out.print("첫 번째 수("+a+")와 두 번째 수("+b+")는 같은 수입니다.");}
else if(a > b){
   System.out.print("첫 번째 수("+a+")가 두 번째 수("+b+")보다 큰 같은 수입니다.");}
else{
   System.out.print("첫 번째 수("+a+")가 두 번째 수("+b+")보다 작은 수입니다.");}

sc.close();
*/