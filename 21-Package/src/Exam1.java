import study.java.bbs.Article;

public class Exam1 {
	public static void main(String[] args) {
		Article.setCategory("자유게시판");
		
		
		Article a1=new Article(1,"첫번째 글 제목 입니다.","2022-01-01");
		Article a2=new Article(1,"두번째 글 제목 입니다.","2022-01-01");
		Article a3=new Article(1,"세번째 글 제목 입니다.","2022-01-01");
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
	}
}