package AlgoritmosEstruturasdeDados.AlgoritmosPesquisa;

public class PesquisaSequencial {
    public static String pesquisaSequencial(int array[],int x){

        for(int i = 0 ;i < array.length; i++){
            if (x == array[i]) {
                return "O elemento foi encontrado na posição " + i;
            }
        }
        return "O elemento não foi encontrado";
    }
}
