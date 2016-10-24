public class Person{
	
	private String gender;
	private String name;
	private int age;
	private Person next;
	private Person prev;
	
	public Person(String name, String gender, int age){
		
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.next = null;
		this.prev = null;
		
		
	}
	
		public String getName() {
			
			return name;
		}
		
		public int getAge() {
			
			
			return age;
		}
		
		public String getGender() {
			
			return gender;
		}
		
		public Person getNext() {
			
			return next;
			
		}
		
		public void setNext(Person nextPerson) {
			
			this.next = nextPerson;
			
		}
		
		public Person getPrev() {
			
			return prev;
			
		}
		
		public void setPrev(Person prevPerson){
			
			this.prev = prevPerson;
			
			
		}

}