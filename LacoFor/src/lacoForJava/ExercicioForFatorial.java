package lacoForJava;

import javax.swing.JOptionPane;

public class ExercicioForFatorial {
	public static void main(String[] args) {
		int insertedNumber, result;
		result = 0;
		insertedNumber = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro positivo"));
		
		for(int i = insertedNumber - 1; i >= 1; i--) {
			if(result == 0) {
				result = insertedNumber * i;
			}else {
				result = (result * i);
			}
		}
		
		System.out.printf("O fatorial do numero %d e: %d", insertedNumber, result);
		
	}
}
