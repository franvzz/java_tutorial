package paquete;

class Main {

	public static void main(String[] args) {
		// Arrays
		int x[] = new int[10];
		
		for(int i=0; i<x.length; i++) {
			x[i] += i + 2;
			System.out.println("Posición: " + i + ", valor de x " + x[i]);
		}
		
		System.out.println("----------------------");
		
		int y[] = { 2, 20, 33, 45, 85};
		for(int i=0; i<y.length; i++) {
			System.out.println("Posición: " + i + ", valor de y " + y[i]);
		}
	}
	
}
