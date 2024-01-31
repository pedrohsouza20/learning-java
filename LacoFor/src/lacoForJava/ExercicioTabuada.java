package lacoForJava;

import java.util.Scanner;

public class ExercicioTabuada {
	public static void main(String[] args) {
		int numeroInserido;
		
		Scanner scannerDoNumero = new Scanner(System.in);
		
		System.out.println("Digite um numero para saber a tabuada: ");
		
		numeroInserido = scannerDoNumero.nextInt();
		
		for(int blusa = 1; blusa <= 10; blusa++) {
			System.out.printf("%d x %d =  %d\n",numeroInserido, blusa, numeroInserido * blusa);
		}
		
	}
}
