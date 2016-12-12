public class Node<T>{

    private T value = null;

    private Node<T> prev;
    private Node<T> next;

    public Node(T value){
        this.value = value;
    }

    public T getValue(){

      return this.value;

    }

    public Node<T> getNextNode(){

        return this.next;
        
    }

    public Node<T> getPrevNode(){

        return this.prev

    }

    public void setNextNode(Node<T> next){
        this.next = next;

    }

    public void setPrevnode(Node<T> prev){
        this.prev = prev;

    }



}
