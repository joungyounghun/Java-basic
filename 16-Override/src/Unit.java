
public class Unit {
	private String name;
	
	public Unit(String name) {
		this.name=name;
		
	}
	public void attack() {
		System.out.println(name+" >>공격준비");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
