public class MobilePhone extends OldPhone {

		public String[] storedNumbersArray = new String[10];
		private static int storedNumber = 1;



		public void ringAlarm(String string){
		
			System.out.println("Ringing alarm = " + string);
		
		}
		
		public void playGame(String string){
		
			System.out.println("Playing game = " + string);
		
		}
		
		public void printLastNumber(){
			
			int i = 1;
			while(storedNumbersArray[i] != null){
				System.out.println(i + " " + storedNumbersArray[i]);
				i++;
			}
			
		}
		
		@Override 
		public void call(String number){
			
			super.call(number);			
			addNumberToStored(number);

			
		}
	
		public void addNumberToStored(String number){
			
			if(storedNumber == storedNumbersArray.length){
				
				storedNumber = 1;
				storedNumbersArray = new String[10];
				
			}else if(storedNumber < storedNumbersArray.length){
				
				storedNumbersArray[storedNumber] = number;
				
				storedNumber++;
			}
			
			
			
		}


}