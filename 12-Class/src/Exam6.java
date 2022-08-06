import java.util.Scanner;

class Score{
	int num;
	String name;
	int kor,eng,mat,tot,avg;
	
	void set(){ //void set(Score this)
		System.out.println("this=" + this);
		Scanner sc= new Scanner(System.in);
		
		System.out.println("학번 :");
		this.num =sc.nextInt();
		System.out.println("이름 :");
		this.name =sc.next();
		System.out.println("국어 :");
		this.kor =sc.nextInt();
		System.out.println("영어 :");
		this.eng =sc.nextInt();
		System.out.println("수학 :");
		this.mat =sc.nextInt();
		
		this.tot= this.kor + this.eng+this.mat;
		this.avg= this.tot/3;
		
	}
	void print_title() {  //void print_title(score this)
		System.out.println(this);
		System.out.println("*** 성적 출력 ***");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
	}
	void print() {   // void print(score this)
		System.out.println(this);
		System.out.println(this.num +"\t"+this.name +"\t"
				+ this.kor+"\t"+this.eng+"\t"+this.mat+"\t"
				+ this.tot+"\t"+this.avg);
	}
}	
public class Exam6 {
	public static void main(String[] args) {
		Score s1=new Score();
		Score s2=new Score();
		System.out.println("s1="+ s1+ ",s2="+s2);
		
		s1.set();
		s2.set();
		s1.print_title();
		s1.print();
		s2.print();
	}

}
