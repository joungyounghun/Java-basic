
public class Article5 {
	private int seq;  // 글 번호 
	private String subject; // 제목 
	private String content; // 내용
	private String writer; //글쓴이 
	private int hit; 	// 조회수
	private String regDate; // 작성일
	
	public void setSeq(int seq) {
		this.seq=seq;
	}
	public void getSeq() {
		return.seq;
	}
	public void setSubject(String subject) {
		this.subject=subject;
	}
	public void getSubject() {
		return.subject;
	}
	public void setContent(String content) {
		this.content=content;
	}
	public void getcontent() {
		return.content;
	}
	public void setWriter(String writer) {
		this.writer=writer;
	}
	public void getWriter() {
		return.writer;
	}
	public void setHit(int hit) {
		this.hit=hit;
	}
	public void getHit() {
		return.hit;
	}
}
