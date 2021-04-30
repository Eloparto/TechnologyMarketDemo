package onlineTechnologyMarket;

public class Main {

	public static void main(String[] args) {
		
		ProductManager productManager = new ProductManager();
		
		Product product1 = new Product(1,3,"MSI GP65",14280,5);
		
		Product product2 = new Product(2,5,"Canon Eos 250D",5396,11);

		Product product3 = new Product(3,9,"Apple iPad Air 4. Nesil",7499,7);
		
		Product[] products = {product1,product2,product3};
		
		productManager.showProducts(products);
		
		
		
		//ELOPARTO
		productManager.addToCart(product1);
		productManager.purchase(product1);
		

		productManager.addToCart(product2);
		productManager.purchase(product2);
		
		
		productManager.addToCart(product3);
		productManager.purchase(product3);
		
		
	}

}
