package sandbox;

import java.util.ArrayList;

class ListInsertionSortApp {
	
	public static void main(String[] args) {

		// create an array of Link objects
		// send the array to SortedList constructor where the items will be added to List
		// copy items from sorted list back into array

		int size = 10;
		ArrayList<Link> linkList = new ArrayList<Link>(size);

		// Fill our array with Links of random data
		for ( int k = 0; k < size; k++) {
			int n = (int)(java.lang.Math.random()*99);
			linkList.add(new Link(n));
			System.out.println("item added: " + n);
		}

		// copy array items into linked list in sorted order
		SortedList sortedList = new SortedList(linkList);

		for (int i = 0; i < size; i++ ) {
			linkList.set(i, sortedList.remove());
		}

		// Display elements of array that is now ordered
		for ( int l = 0; l < size; l++ ) {
			long linkData = linkList.get(l).data;
			System.out.println("item sorted: " + linkData);
		}

	}
}