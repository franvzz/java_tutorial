package paquete;

public class Main {
	
	/**
	 * Bubble Sort (Orden burbuja)
	 * 	- Ordernar datos
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// array
		int []arreglo = { 7, 1, 4 ,9 };
		
		// sort with BubbleSort
		OrdenadorBurbuja o = new OrdenadorBurbuja();
		o.ordenar(arreglo);
		
		// print
		for(int i = 0; i < arreglo.length; i++) {
			//System.out.println(arreglo[i]);
			System.out.println(arreglo[i]);
		}

	}

}
