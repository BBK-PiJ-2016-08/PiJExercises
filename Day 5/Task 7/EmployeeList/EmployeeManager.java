public class EmployeeManager{


    static int[] employeeIDArray = new int[10];
    static String[] employeeNameArray = new String[10];
    static int arraySize = 10;



    public static void main(String[] args){



    }

    public void printArray(){
      int x = 0;
      while (employeeIDArray[x] != 0){

        System.out.println(x + " " + employeeNameArray[x] + " - " + employeeIDArray[x]);
        x++;
      }
      return;
    }

    public void addEmployee(int id, int arrayNumber, String name){

      Launcher launcher = new Launcher();

          if (arrayNumber == employeeIDArray.length) {


            int[] employeeIDArray2 = new int[employeeIDArray.length * 2];
            String[] employeeNameArray2 = new String[employeeNameArray.length * 2];

              for (int j = 0;j < employeeIDArray.length; j++) {

                    employeeIDArray2[j] = employeeIDArray[j];
                    employeeNameArray2[j] = employeeNameArray[j];

              }

            employeeIDArray = new int[employeeIDArray2.length];
            employeeNameArray = new String[employeeNameArray2.length];
            employeeNameArray = employeeNameArray2;
            employeeIDArray = employeeIDArray2;

            System.out.println("reached end of array " + employeeIDArray.length);

            launcher.readInputs(arrayNumber);


          }

          employeeIDArray[arrayNumber] = id;
          employeeNameArray[arrayNumber] = name;
          arrayNumber++;
          launcher.readInputs(arrayNumber);



    }

}
