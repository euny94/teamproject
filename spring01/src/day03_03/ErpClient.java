package day03_03;

public interface ErpClient {
	public void connect();
	public void close();
	public void sendPurchaseInfo(ErpOrderDate oi);

}
