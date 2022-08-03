
public class Exam3 {
	public static void main(String[] args) {
		// 1~10 합 구하기 
		//1) for 사용
		int sum= 0;
		for (int i=1; i<=10;i++) {
			sum +=i;
		}
		System.out.println("sum =" + sum);
		System.out.println("---------");
		
		sum =0;
		int x=1;
		
		while (x<=10) {
			sum += x;
			x++;
		}
		System.out.println("sum =" + sum);
		System.out.println("---------");
	}

}
