public class PatientTest{


    public static void main(String[] args){

        PatientTest pt = new PatientTest();

        pt.testImpl();
    }

    public void testImpl(){

        PatientImpl patient = new PatientImpl("jake", 13);
        patient = new PatientImpl("paul", 131);
        patient = new PatientImpl("john", -3);
        patient = new PatientImpl("chris", 50);
        patient = new PatientImpl("patrick", 2000);


    }

}
