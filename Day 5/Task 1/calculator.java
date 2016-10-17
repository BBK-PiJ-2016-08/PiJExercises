public class Calculator2{
	double firstNum, secondNum, answer;
	
	
	public static void main(String args[]){
		
		calculator calc = new calculator();
		calc.index();
		
		
	}
	
	public void index(){
		
		System.out.println("Welcome to my calculator");
		System.out.println("Please enter your first number");
		String str = System.console().readLine();
		firstNum = Double.parseDouble(str);
		
		System.out.println("Please enter your second number");
		str = System.console().readLine();
		secondNum = Double.parseDouble(str);
		
		System.out.println("enter: \n 1 to add \n 2 to subtract \n 3 to multiply \n 4 to divide \n 5 to modulus");
		str = System.console().readLine();
		int choice = Integer.parseInt(str);
	
		switch(choice){
			
			case '1':
				answer = addition(firstNum, secondNum);
				break;
			case '2':
				answer = subtract(firstNum, secondNum);
				break;
			case '3':
				answer = multiply(firstNum, secondNum);
				break;
			case '4':
				answer = divide(firstNum, secondNum);
				break;
			case '5':
				answer = modulus(firstNum, secondNum);
				break;
			default:
			    System.out.println("ERROR!");
				break;
		}

		System.out.println("The answer is " + answer);
		
	}
	
	private double addition(double a, double b){
		double answer;
		
		answer = a + b;
		
		return answer;
	}
	private double subtract(double a, double b){
		double answer;
		
		answer = a - b;
		
		return answer;
		
		
	}
	private double multiply(double a, double b){
		
		double answer;
		
		answer = a * b;
		
		return answer;
		
	}
	private double divide(double a, double b){
		double answer;
		
		answer = a / b;
		
		return answer;
	}
	private double modulus(double a, double b){
		double answer;
		
		answer = a % b;
		
		return answer;
	}
}