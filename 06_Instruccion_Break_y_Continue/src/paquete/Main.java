package paquete;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int count=1; count < 11; count++) {
			System.out.println("Ejecutando ciclo...");
			if(count == 5) 
			{
				System.out.println("Se ha ejecutado break");
				break;
			} 			
			// else {
			//continue;
			System.out.println("Count vale: " + count);
			//}
		}
	}

}
