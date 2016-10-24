public class TaskOne{
	
	
	public static void main(String[] args){
		
		
		Supermarket s = new Supermarket();
		PersonQueueList q = new PersonQueueList();
		s.addPerson(new Person("jake", "male", 24));
		Person firstPerson = q.retrieve();
		System.out.println(firstPerson.getName());
		
		
		
	}
	
	
	
	
	
	
}