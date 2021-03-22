import java.util.Scanner;

public class OrdenacaoDeDados {

	public static void main(String[] args) {
		
		System.out.println("_____------������------DESEMPENHO DE ORDENADORES DE DADOS------������------______");

		boolean repeat = true;
		do {//La�o para repeti��o das ordena��es
			System.out.println();
			System.out.println("Formas de inser��o de dados para ordena��o:");
			System.out.println("(1) - Dados inseridos por um arquivo de texto externo.");
			System.out.println("(2) - Dados gerados aleatoriamente pelo sistema.");
			@SuppressWarnings("resource")
			Scanner op = new Scanner(System.in);
			System.out.print("Digite o n�mero da op��o: ");
			String forma = op.nextLine();

			switch(forma){//Switch para sele��o da forma de dados inseridos para ordena��o
				case "1":
					try {//Tratamento de exce��es de leitura do arquivo a ser ordenado
						@SuppressWarnings("resource")
						Scanner scan = new Scanner(System.in);
						
						System.out.println();
					    System.out.print("Informe o nome do arquivo texto: ");
						String nome = scan.nextLine();
						
					    LerArq objArquivo = new LerArq();
				      
						BubbleSort objBubble = new BubbleSort();
						InsertionSort objInsertion = new InsertionSort();
						SelectionSort objSelection = new SelectionSort();
						
						System.out.println();
						System.out.println("Tempo decorrido para ordenar o arquivo inserido:");
						System.out.println("Bubble Sort ---- "+ objBubble.ordena(objArquivo.ler(nome))+ " milisegundos.");
						System.out.println("Insertion Sort - "+ objInsertion.ordena(objArquivo.ler(nome))+ " milisegundos.");
						System.out.println("Selection Sort - "+ objSelection.ordena(objArquivo.ler(nome))+ " milisegundos.");
						
						repeat = false;
					}catch(Exception exp) {
						System.err.println("Erro: "+ exp.getMessage());
						System.out.println();
					}
					break;
					
				case "2":	
					//Instancia��o dos objetos
					BubbleSort objBubble1 = new BubbleSort();
					InsertionSort objInsertion1 = new InsertionSort();
					SelectionSort objSelection1 = new SelectionSort();
					NumsAleatorios nums = new NumsAleatorios();
					
					Scanner scan2 = new Scanner(System.in);
					int quantidade = 0;
					try {//Tratamento de erros de inser��o da quantia de dados a ser gerado
						System.out.println();
						System.out.print("Informe a quantia de dados a ser gerado aleatoriamente para a ordena��o: ");
						quantidade = scan2.nextInt();
						if(quantidade < 0) 
							throw new Exception("Quantidade negativa!");
					}catch(Exception exp2) {
						System.err.println("Erro: "+ exp2.getMessage());
						System.out.println();
						break;
					}
					
					
					nums.setQuantidade(quantidade);
					
					//vetores de armazenamento do texto aleat�rio a ser gerado
					int[] vetorx = new int[quantidade];
					int[] vetor1 = new int[quantidade];
					int[] vetor2 = new int[quantidade];
				    int[] vetor3 = new int[quantidade];
					 
				    //carregamento do vetor auxiliar com o texto gerado aleat�riamente
				    vetorx = nums.gerar();
				    
				    //carregamento dos vetores a serem ordenados
				    for(int i =0; i<quantidade; i++) {
				    	vetor1[i] = vetorx[i];
				    	vetor2[i] = vetorx[i];
						vetor3[i] = vetorx[i];
				    }
				    
					//Chamada dos m�todos
					System.out.println();
					System.out.println("Tempo decorrido para ordenar o arquivo gerado:");
					System.out.println("Bubble Sort ---- "+ objBubble1.ordena(vetor1)+ " milisegundos.");
					System.out.println("Insertion Sort - "+ objInsertion1.ordena(vetor2)+ " milisegundos.");
					System.out.println("Selection Sort - "+ objSelection1.ordena(vetor3)+ " milisegundos.");
					
					repeat = false;
					break;
					
				default:
					System.out.println();
					System.out.println("Op��o inv�lida!");
					
					break;
			}
			
			boolean invalid = true;
			do {//La�o de repeti��o para verificar se deseja fazer nova compara��o
				System.out.println();
				@SuppressWarnings("resource")
				Scanner scan = new Scanner(System.in);
				System.out.print("Deseja fazer nova compara��o? Digite (S)im ou (N)�o: ");
				String nova = scan.nextLine();

				if(nova.equals("S") || nova.equals("s") || nova.equals("Sim") || nova.equals("sim")) {
					repeat = true;
					invalid = false;
				}else if(nova.equals("N") || nova.equals("n") || nova.equals("Nao") || 
						nova.equals("nao") || nova.equals("N�o") || nova.equals("n�o")) {
					repeat = false;
					invalid = false;
				}else {
					System.out.println();
					System.out.println("Op��o inv�lida!");
					invalid = true;
				}
			}while(invalid);			
		}while(repeat);
		System.exit(0);
	}
}
