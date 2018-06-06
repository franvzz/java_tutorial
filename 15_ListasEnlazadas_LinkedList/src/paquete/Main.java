package paquete;

import java.util.LinkedList;

class Main {

	public static void main(String[] args) {
		// instanciar 
		LinkedList lista = new LinkedList();
		
		// add
		lista.add(1);
		lista.add("Palabra");
		lista.add(1, "Segunda Palabra");
		lista.add(3, "Tercer Palabra");
		
		// size de lista
		System.out.println("Tamaño de lista: " + lista.size());
		
		// read
		System.out.println("----------------");
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		// remove
		lista.removeFirst();
		
		// read
		System.out.println("----------------");
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}

}
