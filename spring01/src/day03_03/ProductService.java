package day03_03;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import day03_01.SearchClientFactory;
import day03_01.SearchDocument;

@Component
public class ProductService {
	
	private SearchClientFactory searchClientFactory;
	
	@Resource(name = "productSearchClientFactory") 	// 얘를 searchClientFactory에 넣겠다
	public void setSearchClientFactory(SearchClientFactory searchClientFactory) {
		this.searchClientFactory = searchClientFactory;
	}
	public void createProduct(ProductInfo pi) {
		searchClientFactory.create().addDocument(toSearchDocument(pi));
	}
	public SearchDocument toSearchDocument(ProductInfo pi) {
		return new SearchDocument();
	}
	
	
	

}
