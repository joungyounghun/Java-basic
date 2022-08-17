public class IsoTriangle extends DrawData {
   void draw() {
      for(int i=1; i<=getHeight(); i++) {
         for(int j=0; j<i; j++) {
            System.out.print(getOutchar());
         }
         System.out.println();
      }
      System.out.println();
   }
}