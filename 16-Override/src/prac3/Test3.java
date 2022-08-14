package prac3;

public class Test3 extends Sales{
	private int amount;
	void setProcess() {
		amount=getQty()*getCost();
	}

	void getDisplay(){
		int result=(int)(amount-amount*getDiscount());
		System.out.println(getArticle()+"\t"+result);
		
		
		
	}

}
