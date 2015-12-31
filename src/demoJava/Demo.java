package demoJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class Demo {
	public static void main(String[] args) {
		
		
		List<order> list= new ArrayList<order>();
		order r = new order("1233","ginger");
		order r1 = new order("113","tomato");
		order r2 = new order("123","potato");
		order r3 = new order("1233","ginger12");
		order r4 = new order("123","ginger1");
		order r5 = new order("123","ginger6");
		order r6 = new order("1233","ginger6");
		list.add(r);
		list.add(r1);
		list.add(r2);
		list.add(r3);
	list.add(r4);list.add(r5);list.add(r6);
	Collections.sort(list, new Comparator<order>() {

		
	@Override
	public int compare(order o1, order o2) {
	return o1.getOrder_id().compareTo(o2.getOrder_id());
		                                   }
		});
		
		List<DemoDto> demo=new ArrayList<DemoDto>();
		for (int i = 0; i < list.size(); i++) {
			order order=list.get(i);
			DemoDto dto=new DemoDto();
			dto.setOrder_id(order.getOrder_id());
			List<order> orderlist=new ArrayList<order>();
			for (int j = 0; j < list.size(); j++) {
				order orderbean=list.get(j);
				if(orderbean.getOrder_id().compareTo(order.getOrder_id())==0)
					orderlist.add(orderbean);
			}
			dto.setOrderdetail(orderlist);
			demo.add(dto);
		}
		
		Set<DemoDto> set=new TreeSet(new Comparator<DemoDto>() {

			public int compare(DemoDto o1, DemoDto o2) {
				if(o1.getOrder_id().compareTo(o2.getOrder_id())==0)
				{return 0;}
				return 1;
			}
			
		});
		set.addAll(demo);
		ArrayList newdemo=new ArrayList(set);
		for (int i = 0; i < newdemo.size(); i++) {
			DemoDto dto=(DemoDto) newdemo.get(i);
			System.out.println(dto.getOrder_id());
			for (int j = 0; j < dto.orderdetail.size(); j++) {
				order bean=dto.orderdetail.get(j);
				System.out.println(bean.getProductname());
			}
		
		}
		
			
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	


