package paquete;

public class OrdenadorBurbuja {
	
	public void ordenar(int [] array) {
		int aux;
		boolean cambios = false;
		
		while(true) {
			cambios = false;
			for(int i = 1; i < array.length; i++) {
				if(array[i] < array[i-1]) {
					aux = array[i]; // tomar valor
					array[i] = array[i-1]; // intercambiar valor
					array[i-1] = aux; // intercambiar valor
					
					// hubo cambio...
					cambios = true; 
				}
			}
			// si ya no hubo cambios... break;
			if (cambios = false) {
				break;
			}
		}
	}
}
