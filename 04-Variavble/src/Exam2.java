public class Exam2 {
	public static void main(String[] args) {
		// 일반 변수
		int width = 100;
		// 상수형 변수
		// final : 변수값 변경 금지 명령어
		// => 1번만 데이터값을 저장할 수 있고, 2번째부터는 에러가 남
		final double PI = 3.14;
		
		System.out.println("width = " + width);
		System.out.println("PI = " + PI);
		System.out.println("-----------------");
		
		width = 200;
		//PI = 3;
		System.out.println("width = " + width);
		System.out.println("PI = " + PI);
		System.out.println("-----------------");
	}
}