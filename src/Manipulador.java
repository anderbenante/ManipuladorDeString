import java.util.Scanner;


public class Manipulador {

	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite uma frase:  ");
		String frase = entrada.nextLine();
		
		String fraseOrdenada = entrada.nextLine();
		System.out.println("A frase ordenada é: " + fraseOrdenada );
		
	}
	
	
	public static String ordemCrescente(String frase) {
		String [] palavras = frase.split(" "); 
		
		int numPalavras = palavras.length;
		
		/*String subFrase = "";*/
		
		for(int i = 0; i < palavras.length -1; i++) {
			String palavraAtual = palavras[i];
			String proximaPalavra = palavras[i +1];
			int quantidadeDePalavraAtual = palavraAtual.length();
			int quantidadeDaProximaPalavra = proximaPalavra.length();
			
			
			for(int j = 0; j < palavras.length -1 -i; j++) {
				
				if (quantidadeDePalavraAtual > quantidadeDaProximaPalavra) {
					
					//int aux = quantidadeDePalavraAtual;
					//quantidadeDePalavraAtual.length -i;
				
					
					
					
					String aux = palavraAtual;
					palavras[j] = palavras[j + 1];
					palavras[j + 1] = aux;
					
					
				}
			
			}
			
			
			
		}
		 

		return ordemCrescente;
	}

}
