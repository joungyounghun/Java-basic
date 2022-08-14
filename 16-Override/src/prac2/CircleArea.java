package prac2;

public class CircleArea extends Circle {

	   public CircleArea(int r) {
	      super(r);
	   }
	   
	   @Override
	   public void compute() {
	      super.compute();
	      size = r * r * PI;
	   }
	   
	   @Override
	   public void output() {
	      super.output();
	      System.out.println("원의 넓이 : " + size);
	   }

	}