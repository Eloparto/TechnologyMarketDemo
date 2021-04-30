package onlineTechnologyMarket;

public class ProductManager {

	public void addToCart(Product product) {
		
		System.out.println(product.productName +" Successfully added to cart !"  );

		
	}
	
	public void purchase(Product product) {
		
		System.out.println(product.productName +" Your purchase was succesful !");
		
	} //ELOPARTO
	
	public void showProducts(Product[] product) {
		
		for(int i = 0,a=1; i<product.length; i++,a++) {

			System.out.println(a+"|"+"Category Id: "+product[i].categoryId+"|"+"Product Id: "+product[i].id+"|"+"Product Name: "+product[i].productName+"|"+"Unit Price: "+product[i].unitPrice+"|"+"Stock status: "+product[i].unitStock+"|");
			
		}
	}
	
}
