package AlgoritmosEstruturasdeDados.AlgoritmosOrdenação;

public class InsertionSort {

    public void  insertionSort(int [] array){
        for (int i = 0; i < array.length; i++){
            int copyNumber = array[i];
            int j = 1;
            while (j > 0 &&  copyNumber < array [j - 1]){
                array[j] =array[j - 1];
                j--;
                print_array(array);
            }
            array[j] = copyNumber;

        }
        print_array(array);

    }

    public static void print_array(int[] array) {
        for (int i =0 ;i < array.length; i++){
            System.out.print(array[i]);
        }
    }
}
