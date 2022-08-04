import java.util.Scanner;

public class Practice1 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int []stu = new int[5];

      int sum = 0; 
      double avg = 0;
      
      for(int i=0; i<5; i++) {
         System.out.print(i+1 + "번 학생의 점수를 입력 : ");
         stu[i] = sc.nextInt();
         
         sum = sum + stu[i];
      }
      
      avg = sum / 5;
      
	
    System.out.println();
    System.out.println("총점: " + sum);
    System.out.println("평균: " + avg);
       
   }
}
 