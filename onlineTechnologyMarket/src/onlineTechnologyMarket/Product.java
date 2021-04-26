package onlineTechnologyMarket;

public class Product {

	public Product(int categoryId, int id, String productName, double unitPrice, int unitStock) {
		
		this.categoryId = categoryId;
		this.id = id;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.unitStock = unitStock;
		
		
	} //ELOPARTO
	
	int categoryId;
	int id;
	String productName;
	double unitPrice;
	int unitStock;
	
}
