
public class InsertionSort {
	//Atributos
	private int aux ;
	private int j;
	private long tempoInicial;
    private long tempoFinal;
	
    //Método
	public long ordena(int[] vetor) {
		tempoInicial = System.currentTimeMillis();//Recebe o horário de início da ordenação
		for (int i = 1; i < vetor.length; i++){//laço de ordenação de dados seguindo o método Selection Sort
			aux = vetor[i];
			j = i;
			while ((j > 0) && (vetor[j-1] > aux)){
				vetor[j] = vetor[j-1];
				j -= 1;
			}
			vetor[j] = aux;         
		}
		tempoFinal = System.currentTimeMillis();//Recebe o horário de conclusão da ordenação
		return (tempoFinal - tempoInicial);//Calcula e retorna o tempo decorrido durante a ordenação
	}
}
