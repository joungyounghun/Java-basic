import java.util.Scanner;

public class Practice2 {
	static char grade(double x) {
		switch((int)x/10) {
		case 10:
		case 9: return 'A';
		case 8:	return 'B';
		case 7: return 'C';
		case 6:	return 'D';
		default : return 'F';
		}
	}
	static int input_kor() {
		Scanner sc=new Scanner(System.in);
		System.out.print("국어 점수 입력:");
		return  sc.nextInt();
	}
	static int input_eng() {
		Scanner sc=new Scanner(System.in);
		System.out.print('영어 점수 입력:");
		return sc.nextInt();
	}
	static int calc_tot(int x, int y) {
	      int tot = x + y;
	      return tot;
	}

	static double calc_avg(int x) {
	      double avg = (double)x / 2;
	      return avg;
	     }
	static void output(double avg) {
		System.out.println(grade(avg)+"학점입니다.");
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//선언
		int kor, eng ,tot;
		double avg;
		//입력
		kor = input_kor();
	    eng = input_eng();

		//연산
		tot= calc_tot(kor , eng);
		avg= calc_avg(tot);
		
		output(avg);
		
	}

}
