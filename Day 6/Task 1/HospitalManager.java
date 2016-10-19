public class HospitalManager{
	
	private Patient firstPatient = null;
	

	
	// adds patient 
	public void addPatient(Patient newPatient){
		
		if(firstPatient == null){
			
			firstPatient = newPatient;
				
		}else {
			
			if(firstPatient.getNextPatient() == null){
				 firstPatient.setNextPatient(newPatient);
			
			}else{
				Patient current = firstPatient.getNextPatient();
				
				while(current.getNextPatient() != null){
					current = current.getNextPatient();
				}				
				
			}

		}
	}
	
	


	// checks if the first item is there 	
	public boolean deletePatient(String name){
		
		
		if(firstPatient == null ){
			
			return false;
			
		}else {
		//firstPatient.getName().equals(name)){
			Patient current = firstPatient;
			while(!current.getName.equals(name) || current == null ){
				
				current = current.getNextPatient();
				
			}
			if(current == null){
				
				return false;
				
				
			}else{
				
				return true;
				
			}
		}
	}		
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
