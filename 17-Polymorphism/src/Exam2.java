
public class Exam2 {
	public static void main(String[] args) {
		// 자식 클래스 기준
		AirForce airforce1 =new AirForce("공군 1호");
		AirForce airforce2 =new AirForce("공군 2호");
		Navy navy =new Navy("해군1호");
		Army army1 =new Army("육군1호");
		Army army2 =new Army("육군2호");
		
		airforce1.attack();
		airforce1.boming();
		
		airforce2.attack();
		airforce2.boming();
		
		navy.attack();
		navy.nucleus();
		
		army1.attack();
		army1.tank();
		
		army2.attack();
		army2.tank();
		System.out.println("------------------");
		// 부모 클래스 기준
		Unit[] units = new Unit[5];
		
		units[0]=new AirForce("공군1호");
		units[1]=new AirForce("공군2호");
		units[2]=new Navy("해군1호");
		units[3]=new Army("육군1호");
		units[4]=new Army("육군2호");
		
		// 부대 일괄 공격
		for(int i=0; i<units.length;i++) {
			units[i].attack();// 부모 클래스 기준 동작ㅊ
			
			if(units[i] instanceof Army) {
				//        연산자
				Army a=(Army)units[i];
				a.tank();  // 자식 클래스 기준 동작
			} else if(units[i] instanceof Navy) {
				Navy n=(Navy)units[i];
				n.nucleus(); // 자식 클래스 기준 동작 
				
			} else if(units[i] instanceof AirForce) {
				AirForce af=(AirForce)units[i];
				af.boming(); // 자식클래스 기준 동작
			}
		}
		/*Unit n1=new Unit("육군");
		Army a1=new Army("육군");
		a1.attack();
		a1.tank();
		Navy na1=new Navy("해군");
		na1.attack();
		na1.nucleus();
		AirForce ai1=new AirForce("공군");
		ai1.attack();
		ai1.boming();
		*/
	}

}
