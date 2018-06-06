package paquete;

public class Carro {
	
	double peso, altura, ancho, largo;
	int numeroPuertas;
	String modelo;
	
	public Carro() {
		this.peso = 1000;
		this.altura = 1.90;
		this.ancho = 2;
		this.largo = 4;
		this.numeroPuertas = 5;
		this.modelo = "X6";
	}
	
	public double obtenerPeso() {
		return this.peso;
	}
	
	public double obtenerAltura() {
		return this.altura;
	}
	
	public void apagar() {
		System.out.println("Acabas de apagar el carro!");
	}
	
	public void encender() {
		System.out.println("Acabas de encender el carro!");
	}
	
	public void informacion() {
		System.out.println("Carro Normal");
	}

}

class CarroBMW extends Carro {
	
	public CarroBMW() {
		this.modelo = "BMW";
	}
	
	public void turbo() {
		System.out.println("Acabas de viajar a 100 millas por hora!");
	}
	
	public void informacion() {
		System.out.println("Carro BWM");
	}
	
}

class CarroToyota extends Carro {
	
	public CarroToyota() {
		this.modelo = "Toyota";
	}
	
	public void turbo() {
		System.out.println("Acabas de viajar a 100 millas por hora!");
	}
	
	public void informacion() {
		System.out.println("Carro Toyota");
	}
	
}