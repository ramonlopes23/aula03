import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        
        //array de texto



        //declaraçao de vetor 
        int[] meu_array = new int[5];

        //inicializaçao de vetor por acesso rapido
        meu_array[0]=10;
        meu_array[1]=20;
        meu_array[2]=30;
        meu_array[3]=40;
        meu_array[4]=50;

        //recuperar elementos por acesso rapido
        int element0 = meu_array[0];
        int element1 = meu_array[1];

        System.out.print(element0+""+element1+"\n");
        System.out.println(element0);
        System.out.println(element1);


        for (int i=0; i<meu_array.length;i++){
            System.out.println("Elemento"+i+":"+meu_array[i]);
        }

        //soma de valores do vetor
        int soma = 0;
        for (int numero : meu_array){
            soma = soma + numero;
        }

        System.out.println("Soma "+soma);


        // maior elemento 
        int maior = meu_array[0];

        for (int i = 1; i<meu_array.length; i++){
            if(meu_array[i]>maior){
                maior = meu_array[i];
            }
        }
        System.out.println("Maior valor: "+maior);
        
        
        //a quantidade de elementos é definida no ato da criação por meio de um numero inteiro, podendo ser alterado
        String[] lista_aluno = new String[5];
        lista_aluno[0] = "Ramon";
        lista_aluno[1] = "Higor";
        lista_aluno[2] = "Melissa";
        lista_aluno[3] = "Eddie";
        lista_aluno[4] = "Well";


        //a quantidade de elementos é definida no ato da criação 
        String[] lista_cidade = {"itaqua","poa","mogi","suzano","ferraz"};
        System.out.println(lista_cidade[2]);
        //-----------------------------------------------------------//
        String primeiracidade = lista_cidade[0];
        System.out.println("primeira cidade "+primeiracidade);


        //acesso posicional - percorrendo array de maneira sequencial
        for (int i=0; i<lista_aluno.length;i++){
            System.out.print("Elemento "+i+": "+lista_aluno[i]+"\n");
        }

        for (int i=0; i<lista_cidade.length;i++){
            System.out.print("Elemento "+i+": "+lista_cidade[i]+"\n");
        }

        int[] array1 = {1,2,3,4,5};
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(lista_cidade));

        //verificando o tamanho da array
        System.out.println("Tamanho é: "+lista_cidade.length);


        //copiando um array
        int[] copia = array1.clone();
        String[] copia_cidade = lista_cidade;

        System.out.println(Arrays.toString(copia));
        System.out.println(Arrays.toString(copia_cidade));

        //recortando e copiando para uma nova array
        String[] copia1 = Arrays.copyOf(lista_cidade, 2);
        System.out.println("Copia: "+Arrays.toString(copia1));

        //organizando elementos
        int[] novaarray = {4,5,6,2,3};
        Arrays.sort(novaarray);
        System.out.println("Ordenada em: "+Arrays.toString(novaarray));

        //inserindo um valor igual em todas as posiçoes (preenche somente campos vazios)
        int[] array2 = new int[5];
        Arrays.fill(array2, 10);
        System.out.println("Valores: "+Arrays.toString(array2));

        //verificando se arrays são iguais
        boolean resp = Arrays.equals(lista_cidade, copia_cidade);

        
        System.out.println("Sao iguais: "+resp);

        if(Arrays.equals(lista_cidade, copia1)){
            System.out.println("Elas são iguais");
        }
        else{
            System.out.println("são diferentes");
        }

        //buscando elementos
        int posicao = Arrays.binarySearch(lista_cidade, "itaqua");
        System.out.println("Foi localizada na posição: "+posicao);
                

        // Declaração e inicialização da matriz bidimensional
        int[][] matriz = new int[3][4]; // Cria uma matriz 3x4

        // Inicializando os valores da matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i + j; // Atribui a soma dos índices
            }
        }

        // Acessando e imprimindo os valores da matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Nova linha após cada linha da matriz
        }

    }
    
}
