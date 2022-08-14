
public class Exam2 {
	public static void main(String[] args) {
		Unit n1=new Unit("육군");
		Army a1=new Army("육군");
		a1.attack();
		a1.tank();
		Navy na1=new Navy("해군");
		na1.attack();
		na1.nucleus();
		AirForce ai1=new AirForce("공군");
		ai1.attack();
		ai1.boming();
	}

}
