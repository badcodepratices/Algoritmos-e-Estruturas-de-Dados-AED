package AlgoritmosEstruturasdeDados.AlgoritmosOrdenação;

import static AlgoritmosEstruturasdeDados.AlgoritmosOrdenação.InsertionSort.print_array;
import static AlgoritmosEstruturasdeDados.AlgoritmosOrdenação.Swap.swap;


public class SelectionSort {

    public  void selectionSort(int [] array){
        int index_min;
        for (int i = 0; i < array.length; i++){
            index_min = i;
            for ( int j = i + 1; j < array.length; j++ ){
                if (array[j]<array[index_min]){
                    index_min = j;
                }
            }
            if (index_min != i){
                swap(array,index_min,i);
                print_array(array);
            }
        }
        print_array(array);
    }

}
