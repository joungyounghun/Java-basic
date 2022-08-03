import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("점수 입력: ");
		int jumsu =sc.nextInt();
		
		if(jumsu >= 90) {
			System.out.println("A 학점");
		}else if(jumsu >= 80) {
			System.out.println("B 학점");
		}else if(jumsu >= 70) {
			System.out.println("C 학점");
		}else if(jumsu >= 60) {
			System.out.println("D 학점");
		}else {
			System.out.println("F 학점 ");
		
		}
	}

}
