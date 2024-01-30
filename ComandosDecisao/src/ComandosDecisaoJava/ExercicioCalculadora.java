package ComandosDecisaoJava;

import java.util.Scanner;

public class ExercicioCalculadora {
	public static void main (String[] args) {
		Scanner scannerObject = new Scanner(System.in);
		int choose, number1, number2, result; 
		
		System.out.println("Qual operação você deeja?");
		System.out.println("1 \t Adicao \n 2 \t Subtracao \n 3 \t Multiplicacao \n 4 \t Divisao");
		
		choose = scannerObject.nextInt();
		
		System.out.println("Digite o primeiro numero: ");
		number1 = scannerObject.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		number2 = scannerObject.nextInt();
		
		switch(choose) {
		case 1 : {
			result = (number1 + number2);
			break;
		}
		case 2 : {
			result = (number1 - number2);
			break;
		}
		case 3 : {
			result = (number1 * number2);
			break;
		}
		case 4 : {
			result = (number1 / number2);
			break;
		}
		default: result = (number1 + number2);
		}
		
		scannerObject.close();
		
		System.out.printf("Resultado: %d", result);
		
	}
}
