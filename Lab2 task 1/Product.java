public class Product{
	public static void main(String args[]){
		Products product1=new Products("J8392","Banana",12,100,"Fruit");
		Products product2=new Products("J8393","Hammer",2,300,"Tools");
		Products product3=new Products("J8394","Apple",8,10,"Fruit");
		product1.display();
		product2.display();
		product3.display();
	}
}