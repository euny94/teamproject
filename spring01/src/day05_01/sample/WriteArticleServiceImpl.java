package day05_01.sample;

public class WriteArticleServiceImpl implements WriteArticleService {
	private ArticleDao articleDao;

	public WriteArticleServiceImpl(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}
	
	@Override
	public void wrtie(NewArticleRequest newArticleReq) {
		System.out.println("WriteArticleServiceImpl.write() 호출됨");
		Article article = toArticle(newArticleReq);
		articleDao.insert(article); // profiler 걸림
	}
	
	private Article toArticle(NewArticleRequest newArticleReq) {
		return new Article(newArticleReq.getWriterName(), newArticleReq.getTitle(), newArticleReq.getContent());
	}
	
	

}
