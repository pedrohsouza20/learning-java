package whilePackage;

import javax.swing.JOptionPane;

public class ExercicioTotalParEImpar {
	public static void main(String[] args) {
		int controller = 0;
		int insertedNumber = 0;
		int totalOdd = 0; int totalEven = 0;
		
		while(controller == 0) {
			insertedNumber = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
			
			if(insertedNumber < 0) {
				controller = 1;
			}
			
			if(insertedNumber % 2 == 0) {
				totalOdd++;
			}else {
				totalEven++;
			}
			
		}
		
		System.out.printf("Total de numeros pares: %d\n Total de numeros impares: %d", totalEven, totalOdd);
		
	}
}
