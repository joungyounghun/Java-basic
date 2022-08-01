import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor, eng, mat;

		System.out.print("이름? ");
		name = sc.next();
		System.out.print("국어? ");
		kor = sc.nextInt();
		System.out.print("영어? ");
		eng = sc.nextInt();
		System.out.print("수학? ");
		mat = sc.nextInt();

		System.out.println("\n이름 : " + name + "\n총점 : " + (kor + eng + mat));
	}
}
