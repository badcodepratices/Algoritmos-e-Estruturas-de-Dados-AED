package AlgoritmosEstruturasdeDados.AlgoritmosPesquisa;



public class PesquisaBinariaRecursiva {


   public static int pesquisaBinariaRecursiva(int a[], int x){

                return pesquisaBinariaRecursiva(a ,x, 0,a.length-1);

   }

    private static int pesquisaBinariaRecursiva(int a[], int x, int inicio, int fim) {
        int meio = (fim + inicio) / 2;
        int k = -1;
        if (inicio < fim) {


            if (x == a[meio]) {
                return meio;
            } else if (x < a[meio]) {
                return pesquisaBinariaRecursiva(a, x, inicio, meio - 1);
            } else {
                return pesquisaBinariaRecursiva(a, x, meio + 1, fim);
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int a []= {2,4,7,24,53};
        int x=4;
       System.out.println(pesquisaBinariaRecursiva(a,x));
    }
}
