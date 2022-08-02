/*import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2,num3;
		int result;
		
		System.out.println("이름입력");
		num1=sc.nextInt();
		System.out.println("기본급 입력");
		num2=sc.nextInt();
		
		System.out.println("*** L의 월급***");
		System.out.println("기본급:"+num2);
		result= (num2*0.033);
		System.out.println("세금"+result);
		System.out.println("월급"+num2-result);
	}

}
*/
import java.util.Scanner;

public class Practice1 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      // 변수
      String name;
      int basePay;
      int tax;
      int salary;
      
      // 입력
      System.out.print("이름 입력 : ");
      name = sc.next();
      System.out.print("기본급 입력 : ");
      basePay = sc.nextInt();
      
      // 연산
      tax = (int)(basePay * 0.033);
      salary = basePay - tax;
      
      // 출력
      System.out.println("*** " + name + "의 월급 ***");
      System.out.println("기본급 : " + basePay + "원");
      System.out.println("세금  : " + tax + "원");
      System.out.println("월급  : " + salary + "원");
      
      sc.close();
   }
}