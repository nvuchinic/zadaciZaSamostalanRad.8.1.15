package zadatak3;

public class DoubleLinkedList {
	private Node head;
	private int size;

	/**
	 * creates one lined list
	 */
	public DoubleLinkedList() {
		head = null;
		size = 0;
	}

	/**
	 * method that returns size(number of Nodes) of LinkedListInt object
	 * 
	 * @return number of Nodes in LinkedListInt object
	 */
	public int getSize() {
		size = 0;
		Node current = head;
		if (current == null) {
			size = 0;
		} else {
			while (current != null) {
				size++;
				current = current.next;
			}

		}
		return size;
	}

	/**
	 * adds new node to the list
	 * 
	 * @param value
	 *            int value of the node
	 */
	public void add(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			newNode.previous = null;
			size++;
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;

		}
		current.next = newNode;
		newNode.previous = current;
		newNode.next = null;
		size++;
	}

	/**
	 * removes a precise node from the list
	 * 
	 * @param index
	 *            int place where the node is set
	 */
	public void removeAt(int index) {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException("Ne postoji taj index");
		if (index == 0) {
			head = head.next;
			head.previous = null;
			size--;
			return;
		}
		Node current = head;
		int counter = 0;
		while (counter != index) {
			current = current.next;
			// previous = previous.next;
			counter++;
		}
		if (current.next == null) {
			current.previous.next = null;
			current.previous = null;
		} else {
			current.next.previous = current.previous;
			current.previous.next = current.next;
		}
	}

	/**
	 * adds a node on the precise place in the list
	 * 
	 * @param value
	 *            int value of the node
	 * @param index
	 *            int place in the list
	 */
	public void add(int value, int index) {
		if (index < 0 || index > size)
			throw new IndexOutOfBoundsException("Nema tog indexa");
		Node newNode = new Node(value);
		if (index == 0) {
			newNode.next = head;
			head = newNode;
			size++;
			return;
		}
		if (index == size) {
			add(value);
			return;
		}
		Node current = head;
		int counter = 1;
		while (counter < index) {
			current = current.next;
			counter++;
		}
		newNode.next = current.next;
		current.next = newNode;
		newNode.previous = current;
		size++;
	}

	/**
	 * makes an array from the linked list
	 * 
	 * @return array
	 */
	public int[] toArray() {
		Node current = head;
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = current.value;
			current = current.next;
		}
		return array;
	}

	/**
	 * adds a new linked list onto the to an already existing list
	 * 
	 * @param other
	 *            LinkedListInt new linked list
	 */
	public void add(DoubleLinkedList other) {
		this.size += other.size;
		Node current = head;
		if (head == null) {
			head = other.head;
			return;
		}
		while (current.next != null)
			current = current.next;
		current.next = other.head;
	}

	/**
	 * prints the list
	 */
	public void printList() {
		Node current = head;
		while (current != null) {
			System.out.println(current.value);
			current = current.next;
		}
	}

	private class Node {
		public int value;
		public Node next;
		public Node previous;

		/**
		 * creates a node
		 * 
		 * @param value
		 *            int value of the node
		 */
		public Node(int value) {
			this.value = value;
			next = null;
			previous = null;
		}

		/**
		 * creates a node
		 * 
		 * @param value
		 *            int value of the node
		 * @param next
		 *            Node next node in a row
		 */
		public Node(int value, Node next, Node previous) {
			this.value = value;
			this.next = next;
			this.previous = previous;
		}
	}
}
