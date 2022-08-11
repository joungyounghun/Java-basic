package prac1;

public class ScoreTable {
	private String name; //이름 
	private	int sol;	//맞은수 
	private	static int s; // 배점 (20) 
	private	int Score;			//점수= 맞은수 *배점
	
	public ScoreTable() {
		
	}
	public ScoreTable(String name,int sol) {
		this.name=name;
		this.sol=sol;
	
	}
	void calcScore() {
		Score=sol*s;
		
		
	} 
	void printView() {
		System.out.println(name + "\t" + Score);//
		
	}
	public static int getS() {
	      return s;
	}
	public static void setS(int s) {
	          ScoreTable.s = s;
}
}

/*package prac1;

public class ScoreTable {
   private String name;   // 이름
   private int sol;      // 맞은수
   private static int s;   // 배점(20)
   private int score;      // 점수 = 맞은 * 배점
   
   ScoreTable() {}
   
   // 입력
   ScoreTable(String name, int sol){
      this.name = name;
      this.sol = sol;
   }
   
   // 연산
   public void calcScore() {
      //s = 20;   // 배점 = 20 -> getter/setter로도 가능
      score = sol * s;   
   }
   
   // 출력
   public void printView() {
      //calcScore();   // 계산 후 출력 -> 메인함수에서도 가능
      System.out.println(name + "\t" + score);
   }

   // 배점 getter / setter
   public static int getS() {
      return s;
   }

   public static void setS(int s) {
      ScoreTable.s = s;
   }
}
*/
