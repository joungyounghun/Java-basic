package exam3;
// 자바 빈즈 클래스 
//여러개의 변수를 묶어서 관리 하는 클래스

public class PersonVO {
	private String name;
	private int age;
	private String tel;
	
	public PersonVO() {
		
	}
	public PersonVO(String name, int age, String tel) {
		this.name=name;
		this.age=age;
		this.tel=tel;
	}
	
	//  모든 멤버 변수의 내용을 확인하는 함수
	
	@Override
	public String toString() {
		return "PersonVO [name=" + name + ", age=" + age + ", tel=" + tel + "]";
	}
	//getter /setter 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
