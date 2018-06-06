package paquete;

class Main {
	
	/**
	 * Para crear y escribir en mismo archivo, se ejecuta funcion escribir
	 * Para modificar archivo, se necesita leer archivo y concatenar 
	 */
	public static void main(String[] args) {
		Textos t = new Textos();
		t.escribir("escrito.txt");
	}

}
