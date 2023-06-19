package AlgoritmosEstruturasdeDados.AlgoritmosOrdenação;

import static AlgoritmosEstruturasdeDados.AlgoritmosOrdenação.Swap.swap;


public class BubbleSort {

    public static int[] BubbleSort (int [] array){

        for(int i=0; i< array.length-1;i++){
            for(int j =0;j < array.length-1;j++){
                if (array[j] > array[j+1])
                    swap(array, j,j+1);
            }
        }
        return array;

    }
}
