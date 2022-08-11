import java.util.Random;
import java.util.Scanner;

public class PlusGame3 {
    private int a, b;
    private int ans=0;//입력한 정답
    private int cnt=0;//기회
    private int correct=0;//맞춘개수
    private String s="";//프로그램 종료 여부
    Random random = new Random();
    Scanner sc = new Scanner(System.in);
    private void input() {
    	//랜덤으로 정수 삽입 
    	a=random.nextInt(90)+10;
    	b=random.nextInt(90)+10;
    }

    public void answer() {
        while(true) {
        	correct=0;
        	
            for (int i = 0; i < 5; i++) {//랜덤으로 배열에 정수 삽입
                cnt=0;
                input();
                while (true) {
                    System.out.printf("[%d] %d + %d = ", (i+1), a, b);
                    ans = sc.nextInt();
                    if (ans == (a + b)) {
                        System.out.println("정답입니다.");
                        correct++;
                        break;
                    } else {
                        System.out.println("틀렸습니다.");
                        cnt++;
                        if (cnt == 2) {
                        	System.out.println("정답:"+ (a+b));
                            break;
                        }
                    }
                }
            }
            System.out.println();
            System.out.printf("당신은 총 %d문제를 맞추어서 %d점 입니다.\n", correct, correct * 20);
            correct=0;//맞춘개수 초기화
            System.out.print("continue(y/n) : ");
            s = sc.next();
            if (s.equals("n")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }

}