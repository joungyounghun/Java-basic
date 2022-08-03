
public class Practice5 {
	public static void main(String[] args) {
		
		for(int space=1;space<=5;space++) {
			for(int star=1; star<=5-space;star++) {
				System.out.print(" ");
		}
		for(int star=1;star<=2*space-1;star++) {
				System.out.print("*");
		}
			System.out.println("");
	}

}
}