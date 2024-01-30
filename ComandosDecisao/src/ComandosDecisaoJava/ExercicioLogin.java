package ComandosDecisaoJava;

import java.util.Scanner;

public class ExercicioLogin {
	public static void main(String[] args) {
		Scanner objectLogin = new Scanner(System.in);
		String login, password;
		
		System.out.println("Login:");
		login = objectLogin.nextLine();
		
		System.out.println("Senha:");
		password = objectLogin.nextLine();
		
		objectLogin.close();
		
		if(login.equals("Roger") && password.equals("123")) {
			System.out.println("Logado com Sucesso");
		}else {
			System.out.println("Credenciais incorretas");
		}
		
	}
}
