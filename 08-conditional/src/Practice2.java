import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double kor=0,eng=0,a=0,b=0;
		char grade=0;
		
		//입력
		System.out.print("국어점수 입력:");
		kor=sc.nextInt();
		System.out.print("영어점수 입력:");
		eng=sc.nextInt();
		
		a=kor+eng;
		b=a/2;
		
		switch((int)(b)/10) {
	      case 10 :
	      case 9: grade = 'A'; break;
	      case 8: grade = 'B'; break;
	      case 7: grade = 'C'; break;
	      case 6: grade = 'D'; break;
	      default: grade = 'F'; break;
	       		
		}
		System.out.printf("총점 = %.0f\n평균 = %s\n학점 = %s",a,b,grade);
		sc.close();
	}
	}
/*
import java.util.Scanner;

public class Practice2 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      double evg=0,kor=0, eng=0, score = 0;
      char grade = ' ';
            
      //입력
      System.out.print("국어점수 입력 : ");
      kor = sc.nextInt();
      System.out.print("영어점수 입력 : ");
      eng = sc.nextInt();
      score = kor + eng;
      evg = score/2;
      
      //명령
      switch((int)(evg)/10) {
      case 10 :
      case 9: grade = 'A'; break;
      case 8: grade = 'B'; break;
      case 7: grade = 'C'; break;
      case 6: grade = 'D'; break;
      default: grade = 'F'; break;
		
		
	  //출력
      System.out.printf("총점 = %.0f\n평균 = %s\n학점 = %s",score,evg,grade);

      sc.close();
   }

*/
