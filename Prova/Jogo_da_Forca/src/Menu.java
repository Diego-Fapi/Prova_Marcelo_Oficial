import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Menu {
	int op;
	Scanner ler = new Scanner(System.in);
	
	public void mostrarMenu() throws FileNotFoundException, IOException {
		System.out.println("1 - Jogar");
		System.out.println("2 - Relatorio");
		System.out.println("3 - Sair");
		System.out.println("Opção: ");
		op = ler.nextInt();
		
		switch(op) {
		case 1:
			JogoDaForca jogo = new JogoDaForca();
			jogo.jogar();
			break;
		case 2:
			//relatorio
			break;
		case 3:
			System.exit(0);
			break;
		}
	}
}
