package demoJava;

public class order {
	
	
	
	public order(String order_id, String productname) {
		
		this.order_id = order_id;
		this.productname = productname;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	String order_id,productname;
	

}
