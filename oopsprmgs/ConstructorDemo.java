package oopsprmgs;
class Product{
	String prodName;
	float price;
	Product(){
		prodName="TV";
		price=45356.23f;
	}
	Product(String prodName, float price){
		this.prodName = prodName;
		this.price = price;
	}
	void displayProd(){
		System.out.println("Product Name: "+prodName+"\tPrice: "+price);
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		p1.displayProd();
		Product p2 = new Product("Washing Machine",44999.05f);
		p2.displayProd();
	}
 
}
