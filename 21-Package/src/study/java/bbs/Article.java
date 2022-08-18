package study.java.bbs;

public class Article {
	private static int count=0;
	private static String category;
	
	private int num;
	private String title;
	private String reDate;
	
	public Article(int num,String title,String reDate) {
		this.num=num;
		this.title=title;
		this.reDate=reDate;
		Article.count++;
	}

	@Override
	public String toString() {
		return "글분류=" +category+", 전체글수 ="+count+ ",Article"[num=" + num + ", title=" + title + " , reDate=" + reDate + "]";
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Article.count = count;
	}

	public static String getCategory() {
		return category;
	}

	public static void setCategory(String category) {
		Article.category = category;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getReDate() {
		return reDate;
	}

	public void setReDate(String reDate) {
		this.reDate = reDate;
	}
}	