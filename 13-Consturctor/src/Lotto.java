import java.util.Random;
import java.util.Scanner;
/* 1.구매횟수 입력
 * 2.로또번호 1세트 생성 (순서없이)
 * 3.오름차순 정렬(선택 정렬)
 * 4.1세트 로또번호 출력
 * 5.구매 횟수만큼 반복
 */

public class Lotto {
	private int[] m;  //로또 번호 1세트 저장
	private int buyNum; 	//구매횟수
	
	public Lotto() {
		m=new int[6];
		
	}
	public void inputBuyNum() {
			Scanner sc=new Scanner(System.in);
			System.out.println("구매 횟수를 입력하세요: ");
			buyNum=sc.nextInt();
			System.out.println();
	}
	// 로또 번허 1세트 생성
	// 1~45 사이의 정수 6개로 구성
	// => 숫자는 중복되면 안됨
	public void selectLotto() {
		boolean chk= false;
		Random random=new Random();
		m[0]=random.nextInt(45)+1;
		
		for(int i=1;i<6; )
			m[i]=random.nextInt(45)+1;
			chk=false;
		//번호 중복검사
		for(int j=0; j<i; j++) {
			if(m[i]==m[j]) {
				chk=true;
				break;
			}
		}
		if(!chk)i++;
	}
	public void sort() {
		for(int x=0; x<5; x++) {
			for(int y=x+1; y<6; y++) {
				if(m[x] > m[y]) {
					// 두값을 교환
				int temp=m[x];
				m[x]=m[y];
				m[y]=temp;
				}
			}
		}
	}
	private  void outputResult() {
		for(int i=0; i<m.length; i++) {
			System.out.printf("%2d",m[i]);
		}
		System.out.println();
	}
	private  void doLotto() {
		inputBuyNum();
		for(int i=0; i<buyNum; i++) {
			selectLotto();
			sort();
			outputResult();
		}
	}
}	
