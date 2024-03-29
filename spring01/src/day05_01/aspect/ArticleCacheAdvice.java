package day05_01.aspect;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;

import day05_01.sample.Article;

public class ArticleCacheAdvice {
	private Map<Integer, Article> cache = new HashMap<Integer, Article>();
	
	public Article cache(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("[ACA] 시작");
		try {	//joinporint는 실행되는 그 메소드 자체를 의미
			Integer id = (Integer) joinPoint.getArgs()[0];
			Article article = cache.get(id);
			if (article != null) {
				System.out.println("[ACA] 캐시에서 Article[" + id + "] 구함");
				return article;
			}
			Article ret = (Article) joinPoint.proceed();
			if (ret != null) {
				cache.put(id, ret);
				System.out.println("[ACA] 캐시에서 Article[" + id + "] 추가함");
		}
		return ret;
	} finally {
		System.out.println("[ACA] 끝");
	}
}

}
