package day03_01;

import org.springframework.beans.factory.FactoryBean;

public class SearchClientFactoryBean implements FactoryBean<SearchClientFactory>{
	//임의의 GENERICTYPE을  리턴해줘서 그 TYPE을 처리한다 -> SearchClientFactory
	private String server;
	private int port;
	private String contentType;
	private String encoding = "utf8";
	private SearchClientFactory searchClientFactory;
	
	public void setServer(String server) {
		this.server = server;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}
	// ->SearchClientFactory를 상속받은 오브젝트들만 빌딩을 해라!
	@Override
	public SearchClientFactory getObject() throws Exception {
		if (this.searchClientFactory != null)
		return this.searchClientFactory;
		SearchClientFactoryBuilder builder = new SearchClientFactoryBuilder();
		builder.server(server)
				.port(port)
				.contentType(contentType == null ? "json" : contentType)
				.encoding(encoding);
		SearchClientFactory searchClientFactory = builder.build();
		searchClientFactory.init();	//처리 -> 결국 HttpSearchClientFactory가 실행 된 거 
		this.searchClientFactory = searchClientFactory;
		return this.searchClientFactory;
	}
	// SearchClientFactory 
	@Override
	public Class<?> getObjectType() {
		return SearchClientFactory.class;
	}
	// 싱글톤인지 먼저 확인
	@Override
	public boolean isSingleton() {
		return true;
	}
	
	

}
