class calc{
	int plus (int x,int y) {
		return x+y ;
	}
	int minus (int x,int y) {
		return x-y ;	
	}
	int multiply (int x,int y) {
		return x*y ;	
	}
	int divide (int x,int y) {
		return x/y ;	
	}
	int f(int x, int y) {
		int result= plus(x,y)+ multiply(x,y);
		return result;
	}
}
public class Exam4 {
	public static void main(String[] args) {
		calc calc=new calc();
		System.out.println(calc.plus(100,50));
		System.out.println(calc.minus(100,50));
		System.out.println(calc.multiply(100,50));
		System.out.println(calc.divide(100,50));
		System.out.println(calc.f(100,50));
	}

}
