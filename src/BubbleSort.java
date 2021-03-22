
public class BubbleSort {
	//Atributos
	private boolean troca;
    private int aux;
    private long tempoInicial;
    private long tempoFinal;
    
    //Método
    public long ordena(int[] vetor) {
    	troca = true;
    	tempoInicial = System.currentTimeMillis(); //Recebe o horário de início da ordenação
	    while (troca) {//laço de ordenação de dados seguindo o método Bubble Sort
	        troca = false;
	        for (int i = 0; i < vetor.length - 1; i++) {
	            if (vetor[i] > vetor[i + 1]) {
	                aux = vetor[i];
	                vetor[i] = vetor[i + 1];
	                vetor[i + 1] = aux;
	                troca = true;
	            }
	        }
	    } 
	    tempoFinal = System.currentTimeMillis(); //Recebe o horário de conclusão da ordenação
	    return (tempoFinal - tempoInicial); //Calcula e retorna o tempo decorrido durante a ordenação
    }
}
