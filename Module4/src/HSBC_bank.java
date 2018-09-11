
public class HSBC_bank implements Bank_Interface {
    // here it will become compulsory for HSBC to implement all the methods declared in Bank interface.
	@Override
	public void transfer() {
		
		System.out.println("HSBC transferring money");
		
	}

	@Override
	public void credit() {
		System.out.println("HSBC crediting money");
		
	}

	@Override
	public void debit() {
		System.out.println("HSBC debitting money");
		
	}

}
