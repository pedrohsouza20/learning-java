package lacoForJava;

import javax.swing.JOptionPane;

public class ExercicioForNotas {
	public static void main(String[] args) {
		float nota1, nota2, media, mediaClasse;
		mediaClasse = 0;
		
		for (int i = 1; i <=3; i++) {
			nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota:"));
			nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota:"));
			
			media = (nota1 + nota2) / 2;
			
			System.out.printf("nota do aluno %d: %.1f \n", i, media);
			
			mediaClasse += media;
		}
		
		mediaClasse = (mediaClasse / 3);
		
		System.out.printf("A media da classe e: %.1f", mediaClasse);
		
	}
}
