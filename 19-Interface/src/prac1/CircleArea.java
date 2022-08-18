package prac1;

public class CircleArea extends Circle {
   public CircleArea() {
      // TODO Auto-generated constructor stub
   }
   
   public CircleArea(int r) {
      super(r);
   }

   @Override
   public void compute() {
      setSize(getR()*getR()*PI);
   }

   @Override
   public void output() {
      System.out.println("원의 넓이 : " + getSize());
   }
   
   
}