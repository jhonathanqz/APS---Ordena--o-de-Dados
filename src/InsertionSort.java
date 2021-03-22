
public class InsertionSort {
	//Atributos
	private int aux ;
	private int j;
	private long tempoInicial;
    private long tempoFinal;
	
    //M�todo
	public long ordena(int[] vetor) {
		tempoInicial = System.currentTimeMillis();//Recebe o hor�rio de in�cio da ordena��o
		for (int i = 1; i < vetor.length; i++){//la�o de ordena��o de dados seguindo o m�todo Selection Sort
			aux = vetor[i];
			j = i;
			while ((j > 0) && (vetor[j-1] > aux)){
				vetor[j] = vetor[j-1];
				j -= 1;
			}
			vetor[j] = aux;         
		}
		tempoFinal = System.currentTimeMillis();//Recebe o hor�rio de conclus�o da ordena��o
		return (tempoFinal - tempoInicial);//Calcula e retorna o tempo decorrido durante a ordena��o
	}
}
