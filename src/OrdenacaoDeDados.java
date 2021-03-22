import java.util.Scanner;

public class OrdenacaoDeDados {

	public static void main(String[] args) {
		
		System.out.println("_____------¨¨¨¨¨¨------DESEMPENHO DE ORDENADORES DE DADOS------¨¨¨¨¨¨------______");

		boolean repeat = true;
		do {//Laço para repetição das ordenações
			System.out.println();
			System.out.println("Formas de inserção de dados para ordenação:");
			System.out.println("(1) - Dados inseridos por um arquivo de texto externo.");
			System.out.println("(2) - Dados gerados aleatoriamente pelo sistema.");
			@SuppressWarnings("resource")
			Scanner op = new Scanner(System.in);
			System.out.print("Digite o número da opção: ");
			String forma = op.nextLine();

			switch(forma){//Switch para seleção da forma de dados inseridos para ordenação
				case "1":
					try {//Tratamento de exceções de leitura do arquivo a ser ordenado
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
					//Instanciação dos objetos
					BubbleSort objBubble1 = new BubbleSort();
					InsertionSort objInsertion1 = new InsertionSort();
					SelectionSort objSelection1 = new SelectionSort();
					NumsAleatorios nums = new NumsAleatorios();
					
					Scanner scan2 = new Scanner(System.in);
					int quantidade = 0;
					try {//Tratamento de erros de inserção da quantia de dados a ser gerado
						System.out.println();
						System.out.print("Informe a quantia de dados a ser gerado aleatoriamente para a ordenação: ");
						quantidade = scan2.nextInt();
						if(quantidade < 0) 
							throw new Exception("Quantidade negativa!");
					}catch(Exception exp2) {
						System.err.println("Erro: "+ exp2.getMessage());
						System.out.println();
						break;
					}
					
					
					nums.setQuantidade(quantidade);
					
					//vetores de armazenamento do texto aleatório a ser gerado
					int[] vetorx = new int[quantidade];
					int[] vetor1 = new int[quantidade];
					int[] vetor2 = new int[quantidade];
				    int[] vetor3 = new int[quantidade];
					 
				    //carregamento do vetor auxiliar com o texto gerado aleatóriamente
				    vetorx = nums.gerar();
				    
				    //carregamento dos vetores a serem ordenados
				    for(int i =0; i<quantidade; i++) {
				    	vetor1[i] = vetorx[i];
				    	vetor2[i] = vetorx[i];
						vetor3[i] = vetorx[i];
				    }
				    
					//Chamada dos métodos
					System.out.println();
					System.out.println("Tempo decorrido para ordenar o arquivo gerado:");
					System.out.println("Bubble Sort ---- "+ objBubble1.ordena(vetor1)+ " milisegundos.");
					System.out.println("Insertion Sort - "+ objInsertion1.ordena(vetor2)+ " milisegundos.");
					System.out.println("Selection Sort - "+ objSelection1.ordena(vetor3)+ " milisegundos.");
					
					repeat = false;
					break;
					
				default:
					System.out.println();
					System.out.println("Opção inválida!");
					
					break;
			}
			
			boolean invalid = true;
			do {//Laço de repetição para verificar se deseja fazer nova comparação
				System.out.println();
				@SuppressWarnings("resource")
				Scanner scan = new Scanner(System.in);
				System.out.print("Deseja fazer nova comparação? Digite (S)im ou (N)ão: ");
				String nova = scan.nextLine();

				if(nova.equals("S") || nova.equals("s") || nova.equals("Sim") || nova.equals("sim")) {
					repeat = true;
					invalid = false;
				}else if(nova.equals("N") || nova.equals("n") || nova.equals("Nao") || 
						nova.equals("nao") || nova.equals("Não") || nova.equals("não")) {
					repeat = false;
					invalid = false;
				}else {
					System.out.println();
					System.out.println("Opção inválida!");
					invalid = true;
				}
			}while(invalid);			
		}while(repeat);
		System.exit(0);
	}
}
