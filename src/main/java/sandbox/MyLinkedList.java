package sandbox;

public class MyLinkedList {
	
	private Node head;
	
	private int listCount = 0;
	
	public void add(final String data) {
		
		if (head == null) {
			head = new Node(data);
		}
		
		Node temp = new Node(data);
		Node current = head;
		
		if (current != null) {
			while(current.getNode() != null) {
				current = current.getNode();
			}
			current.setNode(temp);
		}
		listCount++;
	}
	
	public int getCount() {
		
		return listCount;
	}
	
	@Override
	public String toString() {
		
		String nodes = "";
		
		if (head != null) {
			Node current = head.getNode();
			while (current != null) {
				nodes += "[" + current.getData() + "]";
				current = current.getNode();
			}
		}
		return nodes;
	}
}