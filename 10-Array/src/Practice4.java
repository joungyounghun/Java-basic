import java.util.Scanner;

public class Practice4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num ;

	      while(true) {
	         
	         System.out.println("*********\n1. 입력\n2. 검색\n3. 삭제\n4. 종료\n*********");
	         System.out.print("번호 선택 :");
	         num = sc.nextInt();
	        if(num == 4) {
	        	 System.out.println("프로그램을 종료합니다.");
	        	 break;
	        }
	        	
	        }
	         switch(num) {
	         case 1:
	        	 System.out.println("입력을 선택하였습니다.");
	        	 break;
	         case 2:
	        	 System.out.println("검색을 선택하였습니다.");
	        	 break;
	         case 3:
	        	 System.out.println("삭제을 선택하였습니다.");
	        	 break;
	         
	         }
	}
}
/*	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		 int num ;

	      while(true) {
	         
	         System.out.println("*********\n1. 입력\n2. 검색\n3. 삭제\n4. 종료\n*********");
	         System.out.print("번호 선택 :");
	         num = sc.nextInt();
	         
	         if (num==1) {
	            System.out.println("입력을 선택하였습니다.");
	            continue;
	         } else if (num==4) {
	            System.out.println(" 프로그램을 종료합니다.");
	            break;
	         }
	      }
	   }
	}
*/


