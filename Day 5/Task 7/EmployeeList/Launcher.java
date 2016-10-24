public class Launcher{
  static int arrayNumber = 0;
  EmployeeManager em = new EmployeeManager();

    public static void main(String[] args){

        Launcher launcher = new Launcher();
        launcher.readInputs(arrayNumber);

    }

    public void readInputs(int arrayNum){

        System.out.println("Please enter the name for the employee / Type 'stop' to finish");

        String name = System.console().readLine();

        if (name.equals("stop")) {

          em.printArray();
          return;
        }

        System.out.println("Please enter the ID number for employee");

        String str = System.console().readLine();
        int id = Integer.parseInt(str);

        em.addEmployee(id, arrayNum, name);




    }

}
