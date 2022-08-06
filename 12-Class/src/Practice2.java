import java.util.Scanner;
class Gugudan {
	int first,last;
	void setGugudan(int s,int e) {
		first=s;
		last= e;
	}
	void dispGugudan() {
		for(int i=first; i <= last; i++) {
			for(int j=1; j < 10; j++) {
				 System.out.printf("%d *%d =%2d",i,j,(i*j));
				}
			System.out.println();
		}
	}
}
public class Practice2 {
	public static void main(String[] args) {
		Gugudan g1= new Gugudan();
		Scanner sc=new Scanner(System.in);
		int s, e;
		
		System.out.println("시작단:");
		s= sc.nextInt();
		System.out.println("끝단:");
		e= sc.nextInt();
		
		g1.setGugudan(s,e);
		g1.dispGugudan();
	}
}

