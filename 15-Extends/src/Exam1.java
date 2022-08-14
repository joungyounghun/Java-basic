
public class Exam1 {
	public static void main(String[] args) {
		// 부모 클래스 사용
		Calcparent parent=new Calcparent();
		System.out.println(parent.puls(100,200));
		System.out.println(parent.minus(100,200));
		System.out.println("-----------------");
		// 자식 클래스 사용
		CalcChild child =new CalcChild();
		System.out.println(child.puls(100,200));
		System.out.println(child.minus(100,200));
		System.out.println(child.multiply(100,200));
		System.out.println(child.divide(100,200));
	}
}
