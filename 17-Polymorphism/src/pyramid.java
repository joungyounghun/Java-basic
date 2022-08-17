public class pyramid extends DrawData {
   void draw() {
      for(int i=1; i<=getHeight(); i++) {
         for(int j=getHeight(); j>i; j--) {
            System.out.print(" ");
         }
         for(int k=0; k<2*i-1; k++) {
            System.out.print(getOutchar());
         }
         System.out.println();
      }
      System.out.println();
   }
}