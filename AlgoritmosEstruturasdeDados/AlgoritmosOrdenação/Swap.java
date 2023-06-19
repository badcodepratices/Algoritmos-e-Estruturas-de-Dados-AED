package AlgoritmosEstruturasdeDados.AlgoritmosOrdenação;

public class Swap {

    public static void  swap(int []array,int primeiro,int segundo){

        int temp = array[primeiro];
        array[primeiro] = array[segundo];
        array[segundo] = temp;
    }
}
