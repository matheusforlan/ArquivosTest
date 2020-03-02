package arquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo {
	
	
	public static String Read(String Caminho) {
		
		String conteudo = "";
		
		try {
			FileReader arq = new FileReader(Caminho);
			BufferedReader lerarq = new BufferedReader(arq);
			String linha = "";
			
			try {
				linha = lerarq.readLine();
				
				while (linha != null) {
					
					conteudo += linha +  "\n";
					linha  = lerarq.readLine();
					
				}
				
				arq.close();
				return conteudo;
						
			} catch (IOException ex) {
				
				System.out.println("Erro: Não foi possível ler o arquivo");
				return "";
				
			}
		} catch (FileNotFoundException ex) {
			System.out.println("Erro: Arquivo não encontrado");
			return "";
		}
		
	}
	
	public static boolean Write (String Caminho, String Texto) {
		
		try {
			
			FileWriter arq = new FileWriter(Caminho);
		    
			PrintWriter gravarArq = new PrintWriter(arq);
			
			gravarArq.println(Texto);
			gravarArq.close();
			return true;
		}
		
		catch (IOException ex) {
			
			System.out.println(ex.getMessage());
			return false;
		}
	}

}
