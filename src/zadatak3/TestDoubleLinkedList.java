package zadatak3;

public class TestDoubleLinkedList {
	public static void main(String[] args) {
		DoubleLinkedList dll = new DoubleLinkedList();
		dll.add(3);
		dll.add(4);
		dll.add(6);
		dll.add(33);
		dll.add(23);
		dll.add(12, 2);
		dll.printList();
		System.out.println("\n\n");
		dll.removeAt(2);
		dll.printList();
	}
}
