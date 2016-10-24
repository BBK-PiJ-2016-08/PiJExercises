public class Supermarket{


		private PersonQueueList q;
		
		//private Person personListStart = null;
		
		public Supermarket() {
			
			//this.personListStart = null;
		}
		
		public void addPerson(Person person){
			
			if(q == null){
				
				q = new PersonQueueList();
				
			}else{
				q.insert(person);
				System.out.println("person added to queue");
			}
		}
		
		public Person servePerson(){
		
			if (q == null){
				
				
				return null;	
			}else{
				
				return q.retreive();

			}
		
		
		}
	

}