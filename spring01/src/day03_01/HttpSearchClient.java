package day03_01;

public class HttpSearchClient implements SearchClient {

	@Override
	public void addDocument(SearchDocument searchDocument) {
		System.out.println("문서 추가함");
	}

	@Override
	public void checkLive() {
		System.out.println("상태 확인");
	}

}
