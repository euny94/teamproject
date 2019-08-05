package day03_01;

public class SearchClientFactoryBuilder {
	
	private String host;
	private int port;
	private String contentType;
	private String encoding;
	
	public SearchClientFactoryBuilder server(String host) {
		this.host = host;
		return this;
	}
	public SearchClientFactoryBuilder port(int port) {
		this.port = port;
		return this;
	}
	public SearchClientFactoryBuilder contentType(String contentType) {
		this.contentType = contentType;
		return this;
	}
	public SearchClientFactoryBuilder encoding(String encoding) {
		this.encoding = encoding;
		return this;
	}
	// HttpSearchClientFactory 와 SearchClientFactory 의 관계는 ? 상속관계
	public SearchClientFactory build() {
		return new HttpSearchClientFactory(host+":"+port,contentType,encoding); //INJECTION 되는 내용	
	}
	

}
