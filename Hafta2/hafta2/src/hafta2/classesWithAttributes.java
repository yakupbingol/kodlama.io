package hafta2;

public class classesWithAttributes {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("HP Laptop");
		product.setPrice(7500);
		product.setStockAmount(7);
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());
		

	}

}
