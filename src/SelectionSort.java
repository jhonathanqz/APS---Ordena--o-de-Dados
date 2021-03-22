
public class SelectionSort {
	//Atributos
	private int posicaoMenor;
	private int aux;
	private long tempoInicial;
    private long tempoFinal;
	
    //Método
	public long ordena(int vetor[]) {
		tempoInicial = System.currentTimeMillis();//Recebe o horário de início da ordenação
		for (int i = 0; i < vetor.length; i++) {//laço de ordenação de dados seguindo o método Selection Sort
			posicaoMenor = i;
			for (int j = (i + 1); j < vetor.length; j++) {
				if (vetor[j] < vetor[posicaoMenor]) {
					posicaoMenor = j;
				}
			}
			if (vetor[i] != vetor[posicaoMenor]) {
				aux = vetor[i];
				vetor[i] = vetor[posicaoMenor];
				vetor[posicaoMenor] = aux;
			}
		}
		tempoFinal = System.currentTimeMillis();//Recebe o horário de conclusão da ordenação
		return (tempoFinal - tempoInicial);//Calcula e retorna o tempo decorrido durante a ordenação
	}
}
