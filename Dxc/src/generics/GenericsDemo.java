package generics;

public class GenericsDemo {

public static void main(String[] args) {
	/*
	 * Account<String> account = new Account<String>();
	 * account.setObj("sbi account"); System.out.println(account.getObj());
	 */
	
	Account<Integer> gpayAccount = new Account<>();
	gpayAccount.setObj(914529970);
	System.out.println("gpay account no is"+ gpayAccount.getObj());
	
	Account <Float> phonePeAccount = new Account<>();
	phonePeAccount.setObj(3.14f);
	System.out.println("phonepay account no is"+ phonePeAccount.getObj());
}

}

