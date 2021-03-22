import java.util.Random;

public class NumsAleatorios {
	private int quantidade;
	
	public void setQuantidade(int quantidade) {
		//recebe a quantidade de caracteres que dever� conter o texto aleat�rio gerado
		this.quantidade = quantidade;
	}

	public int[] gerar() {
		//vetor de armazenamento do texto aleat�rio a ser gerado
        int[] vetor = new int[quantidade];
        Random gerador = new Random();
        //carregamento do vetor com a quantidade de caracteres indicada
        for (int i = 0; i < quantidade; i++) {
        	vetor[i] = gerador.nextInt()*9;
        }
        return vetor;
	}
}
       

