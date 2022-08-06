import java.util.Scanner;
class Triangle {
	int base, height;
	
	Scanner sc= new Scanner(System.in);
	void setTriangle(int b,int h) {
		base=b;
		height= h;
		
	}
	//연산

	double getArea () {
		return (double) (base*height)/2;
	}
}

public class Practice1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int b,h;
		
		System.out.println("*** 삼각형 넓이 구하기 ***");
		System.out.print("밑변 :");
		b=sc.nextInt();
		System.out.print("높이:");
		h=sc.nextInt();
		
		Triangle t= new Triangle();
		t.setTriangle(b,h);
		
		System.out.println("삼각형의 넓이 :"+ t.getArea());
	}

}
