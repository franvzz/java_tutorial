package paquete;

import java.io.*;

public class Textos {
	public void escribir(String nombreDeArchivo) {
		File f; // crea obj file
		f = new File(nombreDeArchivo);
		
		// Escritura
		try {
			FileWriter w = new FileWriter(f); // FileWriter
			BufferedWriter bw = new BufferedWriter(w); // Buffer
			PrintWriter wr = new PrintWriter(bw); // Print
			
			wr.write("Linea de texto \n"); // escribir texto
			wr.append("Mi archivo de texto creado con java"); // escribir texto
			wr.close(); // cerrar wr y guardar texto
			bw.close();	// cerrar bw y guardar texto
			
		} catch(IOException e) { };
	}
	
	public void leer(String nombreDeArchivo) {
		try {
			FileReader r = new FileReader(nombreDeArchivo);
			BufferedReader buffer = new BufferedReader(r);
			
			// System.out.println(buffer.readLine());
			
			String temp="";
			
			while(temp != null) {
				
				temp = buffer.readLine();
				if(temp == null) 
					break;
				
				System.out.println(temp);

			}
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
