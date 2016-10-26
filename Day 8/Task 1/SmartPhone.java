public class SmartPhone extends MobilePhone {
	
	public int[] internationalNumbers = {44,66,99,24,56};

		public void browseWeb(String string){
		
			System.out.println("Browsing website = " + string);
		
		
		}
		
		public String findPosition(){
			double longitude = 32.589933;
			double latitude = 332.589933;
			
			String longitudeStr = Double.toString(longitude);
			String latitudeStr = Double.toString(latitude);
			
			String position = ("Your longitude is " + longitudeStr + " and your latitude is " + latitudeStr);

			return position;
			
		}
		
		@Override 
		public void call(String number){
			super.call(number);
			String dialCode = number.substring(0,2);
			int dialCodeInt = Integer.parseInt(dialCode);
			
			System.out.println("Dial code is: " + dialCodeInt);
			for(int j = 0; j <= internationalNumbers.length -1; j++){
				
				if(dialCodeInt == internationalNumbers[j]){
					
					System.out.println("Number is international, calling via the internet.");
					
				}
				
			}
			
			
			
		}
		




}