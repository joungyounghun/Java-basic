import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int length, height;
		double area;

		System.out.println("**** 삼각형 넓이 구하기 ****");
		System.out.print("밑변 : ");
		length = sc.nextInt();
		System.out.print("높이 : ");
		height = sc.nextInt();

		area = length * height / 2.0;
		//area = length * height / 2;

		System.out.printf("넓이 : %.2f", area);

	}

}