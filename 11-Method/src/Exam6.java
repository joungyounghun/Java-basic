import java.util.Scanner;

public class Exam6 {
	static int puls(int a,int b) {
		return a+b;
	}
	static double puls(int a,double  b) {
		return a+b;
	}
	static double  puls(double  a,int b) {
		return a+b;
	}
	static double  puls(double a,double b) {
		return a+b;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(puls(5,7));    // puls(int ,int)
		System.out.println(puls(5,7.7));  // puls(int,double)
		System.out.println(puls(5.5,7));  //puls(double a,int b)
		System.out.println(puls(5.5,7.7)); //puls(double a,double b)
		
		

}
}