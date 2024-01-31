package lacoForJava;

import javax.swing.JOptionPane;

public class ExercicioNumerosImpares {
	public static void main(String[] args) {
		int insertedNumber;
		insertedNumber = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		
		for(int i = 1; i<= insertedNumber; i++) {
			if(i % 2 != 0) {
				System.out.printf("%d\n", i);
			}
		}
		
	}
}
