public class Launcher{

	public static void main(String[] args){
		
		HospitalManager myHM = new HospitalManager();
		
		Patient mary = new Patient("mary", 66, "Meningitis");
		
		myHM.addPatient(mary);
		

	}


}