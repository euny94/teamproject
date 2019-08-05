package day03_03;

import java.util.List;

import day03_01.SearchClient;
import day03_01.SearchClientFactory;

public class SearchServiceHealthChecker {
	private List<SearchClientFactory> factories;

	public void setFactories(List<SearchClientFactory> factories) {
		this.factories = factories;
	}
	
	public void check() {
		for (SearchClientFactory factory : factories) {
			SearchClient searchClient = factory.create();
			searchClient.checkLive();
		}
	}
	
	
	

}
