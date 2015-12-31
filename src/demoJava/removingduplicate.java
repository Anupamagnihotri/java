package demoJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class removingduplicate {
	
	
	public static void main(String[] args) {
		
		
		
		List<Product> list=new ArrayList<Product>();
	    List<Product> dummylist=new ArrayList<Product>();
	    List<Product> newlist=new ArrayList<Product>();
	    List<Integer> index=new ArrayList<Integer>();
	    Product p=new Product("patato", 1.2f);
	    Product p1=new Product("tomato", 1.2f);
	    Product p2=new Product("ginger", 1.2f);
	    Product p3=new Product("tomato", 2.2f);
	    Product p4=new Product("ginger", 2.2f);
	    Product p5=new Product("tomato", 2.2f);
	    Product p7=new Product("chilli", 2.2f);
	    Product p8=new Product("ginger", 3.2f);
	    Product p9=new Product("chilli", 2.2f);
	    Product p10=new Product("potato", 2.2f);
	    Product p11=new Product("orange", 2.2f);
	    Product p12=new Product("potato", 2.2f);
	    Product p13=new Product("chilli", 2.2f);
	    Product p14=new Product("potato", 2.2f);
	    Product p15=new Product("apple", 2.2f);
	    Product p16=new Product("potato", 2.2f);
	    Product p17=new Product("orange", 2.2f);
	    Product p18=new Product("apple", 2.2f);
	    
	    
	    
	    
	    
	    list.add(p);
	    list.add(p1);
	    list.add(p2);
	    list.add(p3);
	    list.add(p4);
	    list.add(p5);
	    list.add(p7);
	    list.add(p8);
	    list.add(p9);
	    list.add(p10);
	    list.add(p11);
	    list.add(p12);
	    list.add(p13);
	    list.add(p14);
	    list.add(p15);
	    list.add(p16);
	    list.add(p17);
	    list.add(p18);
	    
	    

	    String a[]={"ginger","chilli","tomato"};
	    
	    for (int i = 0; i < a.length; i++) {
	        
	        	String veg=a[i];
	        			for (int j = 0; j < list.size(); j++) {
	            
	        				Product bean=list.get(j);
	        				if(veg.equals(bean.getName()))
	        				{
	        					newlist.add(bean);
	        					index.add(j);
	        					System.out.println(j);
	                
	        				}
	        			}
	    }
	  Collections.sort(index);
	  System.out.println("***");
	   // list.remove(index);
	    int count=0;
	    for (int i = 0; i < index.size(); i++) {
	        int ind=index.get(i);
	        if(i==0)
	            list.remove(ind);
	        else
	            list.remove(index.get(i)-count);
	        System.out.println(count);
	        count++;
	    }
	    newlist.addAll(list);
	    for (Product model : newlist) 
	    {
	        System.out.println(model.getName());
	    }
	    
	    
				}
	           
		
	}
	