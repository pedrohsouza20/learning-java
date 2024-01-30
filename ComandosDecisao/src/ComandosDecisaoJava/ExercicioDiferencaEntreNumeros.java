package ComandosDecisaoJava;

import java.util.Scanner;

public class ExercicioDiferencaEntreNumeros {

	public static void main(String[] args) {
		Scanner scannerObject = new Scanner(System.in);
		int number1, number2;
		int result;
		
		System.out.println("Digite o primeiro número: ");
		number1 = scannerObject.nextInt();
		
		System.out.println("Digite o segundo número: ");
		number2 = scannerObject.nextInt();
		
		result = (number1 - number2);
		
		System.out.printf("%d - %d = %d", number1, number2, result);
		
	}
	
}
