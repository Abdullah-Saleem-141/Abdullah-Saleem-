public class Products{
    private String productid;
    private String productname;
    private int quantity;
    private int productprice;
    private String category;
	
	public Products(String id,String name,int quantity,int price,String category){
		productid=id;
		productname=name;
		quantity=quantity;
		productprice=price;
		category=category;
	}
	public void display() {
        System.out.println("_");
        System.out.println("Product ID: " + productid);
        System.out.println("Product Name: " + productname);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + productprice);
        System.out.println("Category: " + category);
        System.out.println("_");
	}
}