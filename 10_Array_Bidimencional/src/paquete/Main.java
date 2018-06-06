package paquete;

import java.util.Random;

class Main {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cols = 3;
		int rows = 3;
		int arr[][] = new int[cols][rows];
		
		for(int x=0; x < cols; x++) {
			for(int y=0; y < rows; y++) {
				Random rand = new Random();
				int num_random = rand.nextInt(6)+1;  // Entre 0 y 5, más 1.
				arr[x][y] = num_random;
				System.out.println("Arr [" + x + "] [" + y + "] = valor: "+ arr[x][y]);
			}
		}
	}

}
