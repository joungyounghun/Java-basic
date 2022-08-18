package prac1;

public class Practice1 {
   public static void main(String[] args) {
      //1
      CircleArea c1 = new CircleArea(10);
      CircleRound c2 = new CircleRound(10);
      c1.compute();
      c1.output();
      c2.compute();
      c2.output();
      
      //2
      System.out.println("------------------");
      Circle[] c = new Circle[2];
      c[0] = new CircleArea(10);
      c[1] = new CircleRound(10);
      for(int i=0; i<2; i++) {
         c[i].compute();
         c[i].output();
      }
   }
}