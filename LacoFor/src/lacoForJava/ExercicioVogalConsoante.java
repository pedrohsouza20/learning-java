package lacoForJava;

import javax.swing.JOptionPane;

public class ExercicioVogalConsoante {
	public static void main(String[] args) {
		String name;
		int vogalQuant, consoanteQuant;
		vogalQuant = 0;
		consoanteQuant = 0;
		
		for(int i = 0; i < 3; i ++) {
			name = JOptionPane.showInputDialog("Digite o nome: ");
			if(name.trim().toLowerCase().charAt(0) == 'a' ||
					name.trim().toLowerCase().charAt(0) == 'e' ||
					name.trim().toLowerCase().charAt(0) == 'i' ||
					name.trim().toLowerCase().charAt(0) == 'o' ||
					name.trim().toLowerCase().charAt(0) == 'u'
			) {
				vogalQuant++;
			}
			else {
				consoanteQuant++;
			}
		}
		System.out.printf("Iniciados com vogais: %d \n Iniciados com consoantes: %d", vogalQuant, consoanteQuant);
		
	}
}
