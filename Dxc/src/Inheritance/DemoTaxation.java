package Inheritance;
public class DemoTaxation {

	public static void main(String[] args) {
		Incometax incomeTax = new Incometax();
		Gst gst = new Gst();
		int tax = gst.calculateTax(10000);
		System.out.println("tax is  "+tax);
	}

}


