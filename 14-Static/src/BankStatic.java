
public class BankStatic {
	private String name;  
	private double balance;
	private static double rate;
	
	public BankStatic(String name, double balance) {
		this.name= name;
		this.balance=balance;
		
}
	public void print_account() {
		//System.out.println(name+"\t"+balance+"원\t"+BankStatic.rate);
		//같은 클래스안의 멤버함수에서 static 변수는 클래스명을 생략해서 사용할 수있음
		System.out.println(name+"\t"+balance+"원\t"+rate);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public static double getRate() { 
		//자동적으로 스태틱이 붙었다
		return rate;
	}
	public static void setRate(double rate) {
		BankStatic.rate = rate;
	}
}