import java.io.BufferedReader;
import java.io.FileReader;

public class LerArq {
	  private String texto;
	  private int[] teste;
	  
	  public int[] ler(String nome) {
		  
	      texto = "";

	      try {//Tratamento de exceções de leitura do arquivo
	      	  FileReader arq = new FileReader(nome);
	    	  BufferedReader lerArq = new BufferedReader(arq);
	 
	    	  String linha = lerArq.readLine(); // lê a primeira linha
	          // a variável "linha" recebe o valor "null" quando o processo
	          // de repetição atingir o final do arquivo texto
	      
	          while (linha != null) {
	        	  texto += linha;//Concatena as linhas do texto 
	        	  linha = lerArq.readLine(); // Lê da segunda até a última linha
	          }
	  
	          teste = new int[texto.length()];//Gera um vetor com o tamanho do texto
	
	          for (int i = 0; i < texto.length(); i++) {//Carrega o vetor com o texto do arquivo 
	        	  teste[i] = Integer.parseInt(texto.substring(i,i+1));
	          }
	          
	          arq.close();
	          lerArq.close();
	          return teste;
	         
	      } catch (Exception e) {
	    	  throw new RuntimeException("O arquivo "+ nome + " é inválido!");
	      }
	 }
}
		




