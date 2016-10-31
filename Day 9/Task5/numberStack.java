public class numberStack<T> implements Stack<T> {

	private T[] contents;
	private int numIndex;
	
	public void push(T newElement) {
		
		contents[numIndex] = newElement;
		numIndex++;
	}
	public T pop() {
		
		if (numIndex == 0){
			return null;
		}
		numIndex--;
		T result = contents[headIndex];
		contents[headIndex] = null;
		return result;
	}
	



}