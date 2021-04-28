package oopIntro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Product product1=new Product(1,"Lenovo V14",15000,"16 Gb Ram",10,13500);//referans oluþturma,instance
		
		Product product2=new Product();//referans oluþturma,instance
		product2.setId(2);
		product2.setName("lenovo v15");
		product2.setDetail("16 GB ram ");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category1=new Category();
		category1.setId(1);
		category1.setName("içecek");
		
		Category category2=new Category();
		category2.setId(1);
		category2.setName("yiyecek");
		System.out.println(category1.getName());
		System.out.println(category2.getName());
	}

}
