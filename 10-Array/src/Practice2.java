import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// 1월 1일 부터 입력한 날까지 일수 를 구해보자
		//실행 결과: *** 일수 구하기***
		//	월 :5 
		// 	일 :5	
		// 1월 1일 부터 5월 5일까지는 125일 입니다.
		// year ={31,28,31,30,31,31,30,31,30,31};
		// 1.1 ~5.5 
		// 1월+2월+3월+4월+5 =125일
		int[] year ={31,28,31,30,31,30,31,31,30,31,30,31};
		int month=0, day=0;
		int totalDays=0;
		System.out.println("*** 일수 구하기***");
		System.out.print("월 :");
		month = sc.nextInt();
		System.out.print("일 :");
		day=sc.nextInt();
		// 연산 : 데이터 가공하기
		// 5월 5일: 1~4월 + 5
		for (int i=0; i<month-1;i++) {
			totalDays += year[i];
		}
		totalDays += day;
		// 출력: 데이터 및 결과 값 확인하기
		System.out.printf("1월 1일 부터 %d월%d일 까지는 %d일 입니다." , month, day,totalDays );
	}
	}


