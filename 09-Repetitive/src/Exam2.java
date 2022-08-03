import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		for (int X=2; X<=9;X++) {
			for(int y=1; y<=9; y++) {
				System.out.printf("%d*%d=%2d ",X,y,X*y);
			}
			System.out.println("--------------");
			System.out.println();
			
			for (int y=1; y<=9;y++) {
				for(int x=2; x<=9; x++) {
					System.out.printf("%d*%d=%2d ",x,y,x*y);
				}
				System.out.println();
		}
	}

}
}
