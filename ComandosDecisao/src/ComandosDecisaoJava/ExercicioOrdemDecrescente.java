package ComandosDecisaoJava;

import java.util.Scanner;

public class ExercicioOrdemDecrescente {

	public static void main(String[] args) {
		Scanner scannerObject = new Scanner(System.in);
		int number1, number2;
		
		System.out.println("Digite o primeiro numero: \n");
		number1 = scannerObject.nextInt();
		
		System.out.println("Digite o segunda numero: \n");
		number2 = scannerObject.nextInt();
		
		if (number1 > number2) {
			System.out.printf("%d \n%d", number1, number2);
		}else {
			System.out.printf("%d \n%d", number2, number1);
		}
		
	}
	
}
