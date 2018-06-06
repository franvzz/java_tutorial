package paquete;

class Main {

	public static void main(String[] args) {
		// Algoritmos ciclicos
		
		// Serie numeros impares
		for(int i=0; i<=10; i++) {
			// Si residuo es diferente de 0, es impar 
			if( (i % 2) != 0 ) {
				System.out.println("N�mero impar: " + i);
			}
		}
		
		System.out.println("-------------------");
		
		// Serie fibonacci (suma de 2 n�meros anteriores, excepto el 1)
		// 1,1 
		// (1,1), 2
		// (1,2), 3
		// 1,1,(2,3), 5
		// (3,5) 8,
		// 11,...
		int x = 1;
		int anterior = 0;
		int actual = 0;
		while(x < 30) {
			System.out.println("N�m: " + x);
			actual = x;
			x = anterior + actual;
			anterior = actual;
		}
			
	}

}
