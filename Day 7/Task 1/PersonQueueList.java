public class PersonQueueList implements PersonQueue{
	private Person q = null;

	public void insert(Person person){
						
		Person newPerson = new Person(person);
		if (q == null){
			q = newPerson;
			return;
		} else {
			Person current = personListStart;
			while(current.getNext() != null) {
				current = current.getNext();
				}
			current.setNext(newPerson);
			newPerson.setPrev(current);
			return;
		}

						
						
	}

	public Person retrieve(){
		
		
		Person pointer = q;
		
		if(pointer == null){
			
			return null;
		}else {
			
			q.setNext(null);
			
			return pointer;
			
			
		}
		
		
		
	}

}