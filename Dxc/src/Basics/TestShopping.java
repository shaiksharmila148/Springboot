package Basics;

public class TestShopping {
public static void main(String[] args) {
	Customer customerAbdul=new Customer();
	customerAbdul.walkin();
	Security maxSecurity=new Security();
	boolean isCustomer=maxSecurity.scan(customerAbdul);
	if(isCustomer) {
		customerAbdul.shop();
		
	}
	System.out.println("Hey");
}
}