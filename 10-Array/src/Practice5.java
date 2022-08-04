import java.util.Scanner;

public class Practice5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			//선언
	      int num1=0;		//메뉴 번호 저장
	      int position=0;	//위치값 저장
	      boolean[] parking=new boolean[5];
	      
	      
	      while(true) {
	      System.out.println("**********");
	      System.out.println("1. 입차");
	      System.out.println("2. 출차");
	      System.out.println("3. 리스트");
	      System.out.println("4. 종료");
	      System.out.println("**********");
	      System.out.print("메뉴: ");
	      num1 = sc.nextInt();
	      
	      if (num1 == 1) {
	         System.out.println("위치 입력:[1~5] ");
	         position = sc.nextInt();
	         if(parking[position-1]) { //저장된 값이 ture 이면
	        	 System.out.println(" ("+ position  +")위치에 입차 / 이미 주차되어있습니다.");
	         }else {				 //저장된 값이 false 이면	
	        	 System.out.println(" ("+ position +")위치에 입차 / 주차되었습니다.");
	        	 parking[position-1]= true;
	         }
	         
	         System.out.println(" ("+ position +")위치에 입차 / 이미 주차되어있습니다(주차되었습니다)");
	      } else if (num1 == 2) {
	         System.out.println("위치 입력: ");
	         position = sc.nextInt() ;
	         if(parking[position-1]) { //저장된 값이 true 이면, 차가 있음
	        	 System.out.println(" ("+ position +")위치에 입차 / 출차되었습니다.");
	         }else {				 //저장된 값이 false 이면, 비어있음
	        	 System.out.println(" ("+ position +")위치에 입차 / 주차되어 있지 않습니다.");
	        	 parking[position-1]= false;
	         }
	         System.out.println(" ("+ position +")위치에 출차 / 주차되어 있지않습니다(출차되었습니다)");
	      } else if (num1 == 3) {
	    	  for(int i=0; i<parking.length; i++) {
	    		  System.out.println((i +1)+"위치 :"+parking[i]);
	    	  }
	         
	      } else if (num1 == 4) {
	         System.out.println("종료");
	         break;
	         
	      }
	      
	   }
	}
}
		/*while (true) {
			System.out.println("=========================");
			System.out.println("주차장관리프로그램");
			System.out.println("=========================");
			System.out.println("1. 입차 2. 출차 3.리스트 4.종료");
			System.out.print("선택: ");
			int choice = sc.nextInt();
			if (choice == 4) {
				System.out.println("사용해주셔서 감사합니다.");
				break;
			} else if (choice == 1) {
				System.out.println("위치 입력:");
			} else if (choice == 2) {
				System.out.println("위치 입력:");
			}
			  else if (choice == 3) {
					System.out.println("1위치: ture \n 2위치: false \n 3위치: ture \n4위치: false \n5위치: false");
			} else {
				System.out.println("잘못 누르셨습니다.");
			}
		}
		sc.close();
	}
	}

}
*/
