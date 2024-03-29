package day05_01.sample;

import java.util.Date;

public class Article {
	private Integer id;
	private String writerName;
	private String title;
	private String content;
	private Date creationTime;
	
	public Article(String writerName, String title, String content) {
		this.writerName = writerName;
		this.title = title;
		this.content = content;
		this.creationTime = new Date();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getWriterName() {
		return writerName;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", writerName=" + writerName + ", title=" + title + ", content=" + content
				+ ", creationTime=" + creationTime + "]";
	}

}
