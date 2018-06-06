package paquete;

import java.io.*;

public class Textos {
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