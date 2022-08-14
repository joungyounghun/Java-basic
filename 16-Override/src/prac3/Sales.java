package prac3;

import java.util.Scanner;

public class Sales {
   private String article;       // 품목
   private int qty;             // 수량
   private int cost;             // 단가
   private static int cnt;       // 판매건수
   private static double discount; // 할인율

   public Sales() {
   }
   public Sales(String article, int qty, int cost) {
      this.article = article;
      this.qty = qty;
      this.cost = cost;
   }

   public void input() { // 품목, 수량, 단가를 입력받는다.
      Scanner sc = new Scanner(System.in);
      System.out.print("품목 : ");
      article = sc.next();
      System.out.print("수량 : ");
      qty = sc.nextInt();
      System.out.print("단가 : ");
      cost = sc.nextInt();
   }

   // getter / setter
   public String getArticle() {
      return article;
   }
   public void setArticle(String article) {
      this.article = article;
   }
   public int getQty() {
      return qty;
   }
   public void setQty(int qty) {
      this.qty = qty;
   }
   public int getCost() {
      return cost;
   }
   public void setCost(int cost) {
      this.cost = cost;
   }   

   public static int getCnt() { // 총수량 확인
      return cnt;
   }
   public static void setCnt(int cnt) { // 총수량 저장
      Sales.cnt = cnt;
   }
   public static double getDiscount() {
      return discount;
   }
   public static void setDiscount(double discount) { // 할인률을 대입
      Sales.discount = discount;
   }
}
