import java.util.Scanner;

class Sub3{
	Scanner scanner = new Scanner(System.in);
	int cnt;
	int num;
	void input () {
		System.out.print("1~100 사이의 배수를 구할 숫자 입력: ");
        num = scanner.nextInt();
	}
	void calc() {
		for (int i = 1; i<=100; i++) { 
	           if(i%num == 0) {
	              cnt++;    
	              System.out.print(i + " ");
	    }
	}
}
	void output() {
		System.out.println();
        System.out.printf("1~100 사이의 %d의 배수 = %d", num, cnt);
	}
}

public class Practice3 {
   public static void main(String[] args) {
	 Sub3 s1=new Sub3();
	 s1.input();
	 s1.calc();
	 s1.output();
	 
   }
}