package paquete;

import java.util.Stack;

class Main {

	/**
	 * Pila [Stack] (primero entra ultimo en salir)
	 * Son más limitadas que LinkedList 
	 * 
	 * Metodos:
	 * 	- push (agregar dato) 
	 * 	- pop (quitar ultimo dato introducido en pila)
	 * 	- peek (ver ultimo dato introducido en pila)
	 * 	- empty (is empty or not)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// FILO - first-in, last-out
		Stack pila = new Stack();
		pila.push(1);
		System.out.println(pila.peek());
		pila.push("Palabra");
		System.out.println(pila.peek());
		pila.push("Segunda Palabra");
		System.out.println(pila.peek());
		pila.push("Tercer Palabra");
		System.out.println(pila.peek());
		pila.push("Cuarta Palabra");
		System.out.println(pila.peek());
		
		// print all
		System.out.println("----------------");
		for (int i = 0; i < pila.size(); i++) {
			System.out.println(pila.get(i));
		}
		
		// pop
		System.out.println("----------------");
		pila.pop(); // eliminar ultimo item
		for (int i = 0; i < pila.size(); i++) {
			System.out.println(pila.get(i));
		}
		
		// empty (si la posicion esta vacía)
		System.out.println("----------------");
		System.out.println("Empty: " + pila.empty());
				
		// isEmpty (pila esta vacia?)
		System.out.println("----------------");
		System.out.println("isEmpty: " + pila.isEmpty());
		
		// print pila
		System.out.println("----------------");
		for (int i = 0; i < pila.size(); i++) {
			System.out.println(pila.get(i));
		}
		
	}

}
