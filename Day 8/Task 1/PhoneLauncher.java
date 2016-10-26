public class PhoneLauncher {
	public static void main(String[] args) {
		
		
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
		
		
	}

	public void launch() {
	// your code creating and using SmartPhone here...
		System.out.println("Welcome to your mobile phone");
		//OldPhone oldPhone = new OldPhone();
		SmartPhone smartPhone = new SmartPhone();
		MobilePhone mobilePhone = new MobilePhone();
		
		smartPhone.call("0568948749");
		
		System.out.println(smartPhone.findPosition());
		
		String number = ("67584321439");
		smartPhone.call(number);
		number = ("675843535321439");
		smartPhone.call(number);
		number = ("44353535");
		smartPhone.call(number);
		number = ("3535352");
		smartPhone.call(number);
		number = ("464646");
		smartPhone.call(number);
		number = ("3535355");
		smartPhone.call(number);
		number = ("6653535666");
		smartPhone.call(number);
		number = ("7965");
		smartPhone.call(number);
		number = ("9756795");
		smartPhone.call(number);
		number = ("9579543");
		smartPhone.call(number);
		number = ("7458");
		smartPhone.call(number);
		number = ("6436347");
		smartPhone.call(number);
		
		
		System.out.println("Stored numbers are...");
		
		smartPhone.printLastNumber();
		
		//String brand = smartPhone.getBrand();
		
		//System.out.println("Brand is = " + brand);
		
		
		
		
	
	
	}
	
}
