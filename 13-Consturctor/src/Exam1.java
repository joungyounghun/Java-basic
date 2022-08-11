class Book{
	String subject;
	String content;
	
	Book(){ //생성자 class 생성후 단 1번만 실행되고 그이후엔 함수로 취급 x
		System.out.println("생성자 Book () 호출");
		subject = "java 입문";
		content = "java는 여러 방면에 사용됩니다.";
		
	}
	void Book() {
		System.out.println("일반함수 void Book () 호출");
	}
	void read() {
		System.out.println(subject);
		System.out.println(content);
	}
}
public class Exam1 {
	public static void main(String[] args) {
		Book book= new Book();
		book.read();
		book.Book();
		
	}
}
