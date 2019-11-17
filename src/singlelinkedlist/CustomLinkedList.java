package singlelinkedlist;

import java.util.Iterator;
import java.util.List;

/**
 * @author Ali Azhari
 * @File CustomLinkedList.java
 *
 */
public class CustomLinkedList<E> implements Iterable<E> {

	protected static class Node<E> {

		private E element; // reference to the element of this node
		private Node<E> next; // reference to the next node of this node

		public Node(E element) {

			this.element = element;
			this.next = null;
		}

		public Node(E element, Node<E> next) {

			this.element = element;
			this.next = next;
		}

		/**
		 * @return the element
		 */
		public E getElement() {
			return element;
		}

		/**
		 * @param element
		 *            the element to set
		 */
		public void setElement(E element) {
			this.element = element;
		}

		/**
		 * @return the next
		 */
		public Node<E> getNext() {
			return next;
		}

		/**
		 * @param next
		 *            the next to set
		 */
		public void setNext(Node<E> next) {
			this.next = next;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Node [element=" + element + "]";
		}

	}

	private Node<E> head;
	private Node<E> tail;
	private int size;

	public CustomLinkedList() {

		this.head = null;
		this.tail = null;
		size = 0;
	}

	/**
	 * @return the head
	 */
	public Node<E> getHead() {
		return head;
	}

	/**
	 * @param head
	 *            the head to set
	 */
	public void setHead(Node<E> head) {
		this.head = head;
	}

	/**
	 * @return the tail
	 */
	public Node<E> getTail() {
		return tail;
	}

	/**
	 * @param tail
	 *            the tail to set
	 */
	public void setTail(Node<E> tail) {
		this.tail = tail;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	public void addLast(E element) {

		Node<E> node = new Node<>(element);

		if (isEmpty())
			head = node;
		else
			tail.setNext(node);
      
		tail = node;
		size++;
	}

	public void addFirst(E element) {

		head = new Node<>(element, head);

		if (isEmpty())
			tail = head;
		size++;
	}

	/**
	 * Default add that adds node from the tail of the list
	 * 
	 * @param element
	 */
	public void add(E element) {
		addLast(element);
	}

	public void printLinkeList() {
		Node<E> temp = head;
		System.out.println("The list is");
		while (temp != null) {
			System.out.println(temp.getElement());
			temp = temp.getNext();
		}
	}

	/**
	 * @return
	 */
	public E removeFirst() {

		if (isEmpty()) 
			return null;
		
		Node<E> node = head;
		head = head.getNext();
		
		if (size == 1)
			tail = null;
		
		size--;
		
		return node.getElement();

	}
	
	public E removeLast() {
		
		// BigO = n
			
			if (isEmpty()) 
				return null;
			
			Node<E> node = head;
			
			if(size == 1) {
				head = null;
				tail = null;
				return node.getElement();
			}
			
			while (node.getNext().getNext() != null) 
				node = node.getNext();
				
			
			E element = node.getNext().getElement();
			tail = node;
			tail.setNext(null);
			size--;
			
			return  element;
			
			
		}
	
	/**
	 * Default remove last element
	 * @return
	 */
	public E remove() {
		
		return removeFirst();
	}
	
	class ListIterator<E> implements Iterator<E> {

		int count = 0;
		List<E> internalList;
		
		Node<E> current;
		
		
		public ListIterator(Node<E> current) {
	
			
			this.current = current;
		}

		@Override
		public boolean hasNext() {
			if (current == null)
				return false;
			else 
				return true;
		}

		@Override
		public E next() {
			if (current == null)
				return null;
			Node<E> aNode = current;
			current = current.getNext();
			return aNode.getElement();
		}
		
		
		
	}

	@Override
	public  Iterator<E> iterator() {
		
		return  (Iterator<E>) new ListIterator<E>(head);
	}


}
