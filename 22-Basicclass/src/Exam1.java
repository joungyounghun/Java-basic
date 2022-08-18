
public class Exam1 {
	public static void main(String[] args) {
		//기본 데이터형과 객체화된 데이터는 서로 연산이 가능하다.
		// 가운데줄이 표시된 명령어들은 deprecated 된 명령어 임
		// deprecated 된 명령어 : 조만간 없어질 명령어란 뜻.
		Integer integer=new Integer(123);
		
		int x=256;
		int r=integer + x;
		System.out.println(r);
		
		Object ob1=integer;
		Object ob2= x;
		
		System.out.println(ob1);
		System.out.println(ob2);
		
		String a="20";
		String b="3.14";
		
		int num_a=Integer.parseInt(a);
		double num_b=Double.parseDouble(b);
		
		System.out.println(a+100);
		System.out.println(num_a+100);
		
		System.out.println(b+5.5);
		
		
	}
}
