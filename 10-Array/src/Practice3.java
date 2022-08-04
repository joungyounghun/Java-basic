import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//선언
		int [] score = new int[5];
	    int [] rank = new int[5];
	      
	   // 입력  
	    for(int i=0; i<score.length; i++) {
	        System.out.print(i+1 + "번 점수 입력 : ");
	        score[i] = sc.nextInt();
	        rank[i]=1; //랭크는 1로 초기화
	     // 연산, 출력 
		 System.out.println();
		 System.out.println("★★★ 결과 ★★★");
		       
		 for(int i=0; i<score.length; i++) { //기준	     
		     for (int k=0; k<score.length; k++) { //1개씩 값 비교
		             if(score[i] < score[k]) {
		            	rank[i] ++;
		              System.out.print(score[i] + "점 : " + rank[i] + "등");
		              System.out.println();
		             	}    
		             
		     }
		    }
		 }
	    }
	}
/*	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int [] score = new int[5];
	      int [] rank = new int[5];
	      int cnt;
	          // 입력  
	       for(int i=0; i<score.length; i++) {
	          System.out.print(i+1 + "번 점수 입력 : ");
	          score[i] = sc.nextInt();       
	       }
	       // 연산, 출력 
	       System.out.println();
	       System.out.println("★★★ 결과 ★★★");
	       
	       for(int i=0; i<score.length; i++) { //기준
	          cnt = 1;
	          for (int k=0; k<score.length; k++) { //1개씩 값 비교
	             if(score[i] < score[k]) {
	                cnt++;
	          rank[i] = cnt;
	              System.out.print(score[i] + "점 : " + rank[i] + "등");
	              System.out.println();
	              

	             }
	          }
	          
	       }
	}
}
*/
		
	             
	
	


