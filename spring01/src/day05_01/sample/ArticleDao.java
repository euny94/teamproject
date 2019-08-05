package day05_01.sample;

public interface ArticleDao {
	
	void insert(Article article);
	
	Article selectById(Integer id);

}
