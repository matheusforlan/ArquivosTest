package arquivos;

public class Main {
	
	public static void main(String[] args) {
		
		String arq = "Teste.txt";
		
		/**
		String texto = "Don´t make senses \r\n"
				+ "Who9 \r\n" +
				"who \r\n";
		
		if(Arquivo.Write(arq, texto)) {
			System.out.println("Arquivo Salvo");
		} else {
			System.out.println("Erro ao salvar o arquivo");
		}
	}**/
		
		String texto = Arquivo.Read(arq);
		
		if(texto.isEmpty()) {
			System.out.println("Erro ao ler arquivo");
		} else {
			System.out.println(texto);
		}
		
     }
}
