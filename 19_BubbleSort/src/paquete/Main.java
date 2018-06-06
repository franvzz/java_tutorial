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
		int []arr = { 7, 1, 4 ,9 };
		
		// sort with BubbleSort
		BubbleSort o = new BubbleSort();
		o.ordenar(arr);
		
		// print
		for(int i = 0; i < arr.length; i++) {
			//System.out.println(arr[i]);
			System.out.println(arr[i]);
		}

	}

}
