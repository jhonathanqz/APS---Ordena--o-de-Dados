
public class BubbleSort {
	//Atributos
	private boolean troca;
    private int aux;
    private long tempoInicial;
    private long tempoFinal;
    
    //M�todo
    public long ordena(int[] vetor) {
    	troca = true;
    	tempoInicial = System.currentTimeMillis(); //Recebe o hor�rio de in�cio da ordena��o
	    while (troca) {//la�o de ordena��o de dados seguindo o m�todo Bubble Sort
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
	    tempoFinal = System.currentTimeMillis(); //Recebe o hor�rio de conclus�o da ordena��o
	    return (tempoFinal - tempoInicial); //Calcula e retorna o tempo decorrido durante a ordena��o
    }
}
