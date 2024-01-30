package ComandosDecisaoJava;

import java.util.Scanner;

public class ExercicioIfImparPar {

	public static void main(String[] args) {
		
		Scanner scannerObject = new Scanner(System.in);
		int number;
		
		number = scannerObject.nextInt();
		
		System.out.println((number % 2 == 0) ? "Par" : "Impar");
		
		scannerObject.close();
		
	}
}