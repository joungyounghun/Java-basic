
public class Exam4 {
	public static void main(String[] args) {
		
		int sum =0;
		int x=1;
		// 조건식을 트루로 설정했을 경우 반드시 탈출 명령문이 있어야함
		//=> 원래 조건식은 while 문 안에 위치를 자유롭게 배치 할 수있음
		
		while (x<=10) {
			sum += x;
			if(x>=10) break;
			x++;
		}
		System.out.println("sum =" + sum);
	}

}
