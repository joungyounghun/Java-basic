import java.util.Scanner;

class Sub4 {

   Scanner sc = new Scanner(System.in);
   int num;
   String a;

   void input_dan() {
      System.out.print("몇 단을 출력할지 입력하세요 : ");
      num = sc.nextInt();
   }

   void print_gugudan() {
      for (int y = 1; y <= 9; y++) {
         System.out.printf("%d*%d=%s\n", num, y, num * y);
      }
   }

   void input_continue() {
      System.out.print("계속할지 선택하세요(y계속):");
      a = sc.next();
   }

   void isEnd() {
      if (!a.equals("y")) {
         System.exit(0);
      }
   }
}

public class Practice4 {

   public static void main(String[] args) {
    
      while (true) {
        
       Sub4 s1 = new Sub4();
        s1.input_dan();
        s1.print_gugudan();
        s1.input_continue();
        s1.isEnd();
         
        System.out.println(); 
      }
      //System.out.print("종료");
   }
}
