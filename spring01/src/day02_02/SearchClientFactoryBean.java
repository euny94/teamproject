package day02_02;

public class SearchClientFactoryBean {
	
	private String server;
	private int port;
	private String contentType;
	
	public void setServer(String server) {
		this.server = server;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	@Override
	public String toString() {
		return "SearchClientFactoryBean [server=" + server + ", port=" + port + ", contentType=" + contentType + "]";
	}
	
	

}
