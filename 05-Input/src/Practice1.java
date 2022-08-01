
import java.util.Scanner;

public class Practice1 {
   public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int number;
      double num1;
      char ch1;
      boolean b1;
      String name;
      
      System.out.print("정수 입력 : ");
      number = sc.nextInt();
      
      System.out.print("실수 입력 : ");
      num1 = sc.nextDouble();
      
      System.out.print("문자 입력 :");
      ch1 = sc.next().charAt(0);
      
      System.out.print("boolean 입력 :");
      b1 = sc.nextBoolean();
      
      System.out.print("문자열 입력 :");
      name = sc.next();
      
      System.out.printf("정수 : %d\n",number);
      System.out.printf("실수 : %f\n",num1);
      System.out.printf("문자 : %c\n",ch1);
      System.out.printf("boolean : %b\n", b1);
      System.out.printf("문자열 : %s\n", name);
      
      /*
      System.out.println("정수 : " + number);
      System.out.println("실수 : " + num1);
      System.out.println("문자 : " + ch1);
      System.out.println("boolean : " + b1);
      System.out.println("문자열 : " + name);
      */
   }
}
