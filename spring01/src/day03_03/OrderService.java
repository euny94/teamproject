package day03_03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import day03_01.SearchClientFactory;
import day03_01.SearchDocument;

@Component("orderSvc")
public class OrderService {
	
	private ErpClientFactory erpClientFactory;
	private SearchClientFactory searchClientFactory;
	
	@Autowired
	public void setErpClientFactory(ErpClientFactory erpClientFactory) {
		System.out.println("erpClientFactory:"+erpClientFactory);
		this.erpClientFactory = erpClientFactory;
	}
	@Autowired
	public void setSearchClientFactory(@Qualifier("order")SearchClientFactory searchClientFactory) {
		this.searchClientFactory = searchClientFactory;
	}
	public void order(OrderInfo oi) {
		sendOrderInfoToErp(oi);
		addOrderInfoToSearch(oi);
	}
	private void sendOrderInfoToErp(OrderInfo oi) {
		ErpClient erpClient = erpClientFactory.create();
		erpClient.connect();
		erpClient.sendPurchaseInfo(toErpOrderDate(oi));
		erpClient.close();
	}
	private ErpOrderDate toErpOrderDate(OrderInfo oi) {
		return new ErpOrderDate();
	}
	private void addOrderInfoToSearch(OrderInfo oi) {
		searchClientFactory.create().addDocument(toSearchDocument(oi));
	}
	private SearchDocument toSearchDocument(OrderInfo oi) {
		return new SearchDocument();
	}

}
