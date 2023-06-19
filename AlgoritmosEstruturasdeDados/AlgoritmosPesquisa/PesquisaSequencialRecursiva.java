package AlgoritmosEstruturasdeDados.AlgoritmosPesquisa;

public class PesquisaSequencialRecursiva {
    public static int  pesquisaSequencialRecursiva(int [] array, int valor) {

        return pesquisaSequencialRecursiva(array,valor, 0);
    }
    private static  int pesquisaSequencialRecursiva(int [] array, int valor, int indice){
        if(indice >= array.length){
            return -1;
        } else if (array[indice] ==valor) {
            return  indice;
        }
        else
            return pesquisaSequencialRecursiva(array,valor,indice+1);
    }

}
