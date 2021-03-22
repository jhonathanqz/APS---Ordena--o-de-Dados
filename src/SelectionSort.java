
public class SelectionSort {
	//Atributos
	private int posicaoMenor;
	private int aux;
	private long tempoInicial;
    private long tempoFinal;
	
    //M�todo
	public long ordena(int vetor[]) {
		tempoInicial = System.currentTimeMillis();//Recebe o hor�rio de in�cio da ordena��o
		for (int i = 0; i < vetor.length; i++) {//la�o de ordena��o de dados seguindo o m�todo Selection Sort
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
		tempoFinal = System.currentTimeMillis();//Recebe o hor�rio de conclus�o da ordena��o
		return (tempoFinal - tempoInicial);//Calcula e retorna o tempo decorrido durante a ordena��o
	}
}
