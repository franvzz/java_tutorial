package paquete;

import java.util.LinkedList;

class Main {
	
	/**
	 * Cola (variante de LinkedList
	 * Offer - add item in order desc 
	 * Poll - remove items
	 */
	public static void main(String[] args) {
		// FIFO -> First-In, First-Out
		LinkedList cola = new LinkedList();
		
		// add items
		for(int i=1; i<11; i++) { 
			// cola.offer(i); // agregar en orden desc
			cola.push(i); // agregar en order asc
		}
		
		// read
		while(cola.peek() != null) {
			System.out.println(cola.poll());
		}
	}

}
