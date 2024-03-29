import java.util.NoSuchElementException;
//singly linked list with first reference only 

/**
A linked list is a sequence of links with efficient
element insertion and removal. This class 
contains a subset of the methods of the standard
java.util.LinkedList class.
*/

public class CP3LinkedList<E> {

     private class Node
	 {
		public E data;
		public Node next;
		public Node previous;
	 }

	 private Node first;
     private Node last;
		
	 /**
    	Constructs an empty linked list.
	 */
	 public CP3LinkedList()
	 {
	 	first = null;
		last = null;
	 }
 
	/**
 	Adds an element to the front of the linked list.
 	@param element the element to add
	 */
	public void addFirst(E element)
	{  
		Node newLink = new Node();
		newLink.data = element;
		newLink.next = first;
		newLink.previous = null;
		first = newLink;
	}

	public void addLast(E element)
	{
		Node newLink = new Node();
		newLink.data = element;
		newLink.next = null;
		newLink.previous = last;

		if(last != null)
		{
			last.next = last;
		}


		last = newLink;
	}

	public E getFirst() {
		if (first == null)
			throw new NoSuchElementException();

		return first.data;
	}

	public E getLast()
	{
		if (last == null)
			throw new NoSuchElementException();

		return last.data;
	}

	public E removeFirst() {
		if (first == null)
			throw new NoSuchElementException();
		E element = first.data;
		first = first.next;
		return element;
	}

	public boolean isEmpty()
	{
		//if(first.equals(null))
		//	return true;
		//
		//else
		//	return false;

		return first == null;
	}

	//output contents of list
	public void print()
	{
		Node current = first;

		while(current != null)
		{
			System.out.println(current.data);
			current = current.next;
		}
	}

	public int size()
	{
		int size = 0;
		Node current = first;

		while(current != null)
		{
			size ++;
			current = current.next;
		}

        return size;
	}
}
