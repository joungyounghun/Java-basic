
public class Exam3 {
	public static void main(String[]args) {
		// 대입연산자 + 다른 연산자 
		int num1 = 100 ;
		System.out.println("num1= "+num1);
		System.out.println("--------------");
	    
		num1= num1 + 100 ;
		System.out.println("num1= "+num1);
		System.out.println("--------------");
		num1 += 100;
		System.out.println("num1= "+num1);
		System.out.println("--------------");
		
		num1 -= 50;
		System.out.println("num1= "+num1);
		System.out.println("--------------");
		
		num1 *= 2;
		System.out.println("num1= "+num1);
		System.out.println("--------------");
		
		num1 /= 100;
		System.out.println("num1= "+num1);
		System.out.println("--------------");
		num1 %= 2;
		
		System.out.println("num1= "+num1);
		System.out.println("--------------");
	}
}
