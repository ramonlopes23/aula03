public class App {
    public static void main(String[] args) throws Exception {
        
        //declaraçao de vetor 
        int[] meu_array = new int[5];

        //inicializaçao de vetor por acesso rapido
        meu_array[0]=10;
        meu_array[1]=20;
        meu_array[2]=30;
        meu_array[3]=40;
        meu_array[4]=50;

        int element0 = meu_array[0];
        int element1 = meu_array[1];

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
        
    }
}
