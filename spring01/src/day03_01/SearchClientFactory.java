package day03_01;

public interface SearchClientFactory {
	public void init();	// 여기서 오버라이딩을 하게끔 함! (상속을 받으면)
	public SearchClient create();

}
