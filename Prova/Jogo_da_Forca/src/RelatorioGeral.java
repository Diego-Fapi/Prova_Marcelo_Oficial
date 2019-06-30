import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RelatorioGeral {
	public void gerarRelatorio(Jogador jogador, String palavraRodada, int tentativaInicial, boolean ganhou, int tentativa, String letrasUtilizadas, String horainicio, String horafim) {
		File arquivo = new File("arquivo.txt");
	   String newLine = System.getProperty("line.separator");


	    try {
	        FileReader ler2 = new FileReader(arquivo);
	        FileWriter fileWriter = new FileWriter(arquivo, true);
	        
	        BufferedWriter escrever = new BufferedWriter(fileWriter);
	        escrever.write(newLine+newLine + "Nome: "+jogador.nome + "\n");
	        
	        BufferedWriter escrever2 = new BufferedWriter(fileWriter);
	        
	        if (tentativaInicial == 7) {
	        	escrever.write(newLine + "Dificuldades: Fácil\n");
			}else if(tentativaInicial == 5) {
				escrever.write(newLine + "Dificuldades: Médio\n");
			}else if(tentativaInicial == 3) {
				escrever.write(newLine + "Dificuldades: Difícil\n");
			}
	        
	        
	        BufferedWriter escrever3 = new BufferedWriter(fileWriter);
	        escrever.write(newLine + "Palavra: " + palavraRodada + "\n");
	                
	        BufferedWriter escrever4 = new BufferedWriter(fileWriter);
	        	if(ganhou == true) {
	        escrever.write(newLine + "Resultados: Vitória \n");
	        	}else if(ganhou == false) {
	        		escrever.write(newLine + "Resultados: Derrota \n");
	        	}
	        	
	        BufferedWriter escrever5 = new BufferedWriter(fileWriter);
	        escrever.write(newLine + "Tentativas Restentes: " + tentativa + "\n");
	        
	        BufferedWriter escrever6 = new BufferedWriter(fileWriter);
	        escrever.write(newLine + "Palpites: "+letrasUtilizadas + "\n");
	        
	        BufferedWriter escrever7 = new BufferedWriter(fileWriter);
	        escrever.write(newLine + "Interrupção: Numero de Imterrupções (Caso tenha) \n");
	        
	        BufferedWriter escrever8 = new BufferedWriter(fileWriter);
	        escrever.write(newLine + "Data e Hora de Inicio:" + horainicio + " \n");

	        BufferedWriter escrever9 = new BufferedWriter(fileWriter);
	        escrever.write(newLine + "Data e Hora de Fim:" + horafim + "\n");
	        
	        

	        
	        escrever.close();
	        escrever2.close();
	        fileWriter.close();
	      
	        

	        
	        BufferedReader lerb = new BufferedReader(ler2);
	        String linha = lerb.readLine();
	        
	        while(linha !=null) {
	        	System.out.println(linha);
	        	linha = lerb.readLine();
	        }
	    }

	        catch(IOException ex) {
	        	
	        }
	}
}
