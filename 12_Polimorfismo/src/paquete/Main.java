package paquete;

import paquete.Carro;


/**
 * Polimorfismo: Cualquier método se puede re-escribir
 * */

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pelota p;
		//p = new Pelota();
		//p.patearPelota();
		
		Carro c;
		c = new Carro();
		c.informacion();
		
		Carro c1;
		c1 = new CarroToyota();
		c1.informacion();
		
		Carro c2;
		c2 = new CarroBMW();
		c2.informacion();
	}

}
