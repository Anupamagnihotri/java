package demoJava;

public class Product {

	String name;
	float price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Product(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}
	
}
