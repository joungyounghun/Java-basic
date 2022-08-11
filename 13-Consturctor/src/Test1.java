import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		Random random=new Random();
		// random.nextInt(45) : 0~44 사이의 임의 정수 생성
		System.out.println(random.nextInt(45));
		System.out.println(random.nextInt(45)+1);
	}

}
