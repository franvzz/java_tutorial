package paquete;

import java.io.*; // -- input/output (captura de teclado) 

class Main {
	
	/**
	 * @params args
	 * leer desde teclado 
	 * concat()
	 * toUpperCase()
	 * toLowerCase()
	 * length()
	 * Convertir variables numericas a Stgrins y viceversa
	 * */
	public static void main(String[] args) {
		// vars
		String texto = "";
		int x = 0;
		
		// canal de datos
		InputStreamReader in = new InputStreamReader(System.in);
		// espacio en memoria para almacenar los datos
		BufferedReader buffer = new BufferedReader(in);
		
		// read buffer
		try {
			texto = buffer.readLine(); // leer datos de teclado
		} catch(IOException e) { };
		
		
		// string
		texto = texto.concat("-esto es una concatenacion");
		System.out.println("Texto: " + texto);
		texto = texto.toLowerCase();
		System.out.println("Texto: " + texto);
		texto = texto.toUpperCase();
		System.out.println("Texto: " + texto);
		
		// length
		int longitud = texto.length();
		System.out.println("Longitud de Texto: " + longitud);
	
		
		// int to stg
		try {
			texto = buffer.readLine(); // leer datos de teclado
			x = Integer.parseInt(texto);
		} catch(Exception e) { 
			System.out.println("Debes escribir un número");
		};
		System.out.println("Texto a Integer: " + x);
		
		
		// number to String
		String texto2 = "";
		double y = 5.2;
		
		texto = String.valueOf(y);
		texto = texto.concat("+5");
		System.out.println("Numero a Texto: " + texto);
	}

}
