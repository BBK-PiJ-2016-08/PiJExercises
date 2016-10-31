public class Comparator {
	
	public static void main(String[] args){
		
		Comparator cm = new Comparator();
		cm.launcher();

	}
	
	public void launcher(){
		
		String StringOne = "3";
		String StringTwo = "5";
		Integer iOne = 3;
		Integer iTwo = 5;
		double dOne = 4.6;
		double dTwo = 5.7;
		
		/*System.out.println(getMax(Double.parseDouble(StringOne),Double.parseDouble(StringTwo)));
		System.out.println(getMax(iOne.doubleValue(),iTwo.doubleValue()));
		System.out.println(getMax(dOne, dTwo));*/

		System.out.println(getMax(12,2));
		System.out.println(getMax("12","2"));
		System.out.println(getMax(12.0,2.7));
		}

	public int getMax(int d1, int d2) {
		return (int) getMax((double) d1,(double) d2);
	}
	public String getMax(String d1, String d2) {
		return "" + getMax(Integer.parseInt(d1),Integer.parseInt(d2));		
	}
	public double getMax(double d1, double d2) {
		if (d1 > d2) {
			return d1;
		} else {
			return d2;
		}
	}

}