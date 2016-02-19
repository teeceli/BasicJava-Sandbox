package sort;

import java.util.ArrayList;

class SortedList {
	
	private Link first;

	// default constructor (no args)
	public SortedList() {
		first = null; 		// default when list is empty
	}

	public SortedList( Link[] linkArr ) {
		first = null;
		for ( int i = 0; i < linkArr.length; i++) {
				insert(linkArr[i]);
		}
	}

	public SortedList( ArrayList<Link> linkList ) {
		first = null;
		for ( int i = 0; i < linkList.size(); i++) {
			insert(linkList.get(i));
		}
	}

	public void insert(Link k) {
		Link previous = null;	// start at beginning
		Link current = first;

		while (current != null && k.data > current.data) {
			previous = current;
			current = current.next;
		}

		// 10 30 trying to insert 20 - 
		if (previous == null) {
			// if no items in the list we point first to the new link and below, k.next will point to null because we set current to first
			first = k;	
		} else {
			// set previous to point to new link we are inserting
			previous.next = k;
		}

		// point to the link that was larger when the while condition failed
		k.next = current;
	}

	// remove first 10 20 30
	public Link remove() {
		Link temp = first;
		first = first.next;
		return temp;
	}

}