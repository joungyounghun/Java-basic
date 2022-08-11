class Address{
	private String name;
	private String phone;
	private String address;
	
	Address (){
	}
	public void Address(String name,String phone, String address){
		this.name= name;
		this.phone=phone;
		this.address=address;
	public void showAddress(String name,String phone, String address){
			System.out.printf("이름: %s \n전화: %s\n주소: %s",name,phone,address);
	
}
public class Practice2 {
	public static void main(String[] args) {
		Address a1;
		a1 =new Address("홍길동","010-1234-5678","서울시 강남구 역삼동");
		
		a1.showAddress();
	}

}
/*
public class Address  {
   private static String name;
   private static String number;
   private static String address;
   
   public Address(String name, String number,String address) {
      this.name = name;
      this.number = number;
      this.address = address;
   }
   
   public void setName(String name) {
      this.name = name;
   }
public static String getName() { 
   return name;
}
public void setNumber(String number) {
   this.number = number;
}
public static String getNumber() {
   return number;
}
public void setAddress(String address) {
   this.address = address;
}
public static String getAddress() {
   return address;
      
}

public void showAddress() {
System.out.println("이름 : " + Address.getName());
System.out.println("전화 : " + Address.getNumber());
System.out.println("주소 : " + Address.getAddress());   
}

}
*/