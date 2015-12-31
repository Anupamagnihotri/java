package demoJava;

import java.util.List;

public class DemoDto {
	
	String order_id;
	
	List<order> orderdetail;

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public List<order> getOrderdetail() {
		return orderdetail;
	}

	public void setOrderdetail(List<order> orderdetail) {
		this.orderdetail = orderdetail;
	}
	
	
	

}
