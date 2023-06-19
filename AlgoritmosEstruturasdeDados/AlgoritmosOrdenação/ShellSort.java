package AlgoritmosEstruturasdeDados.AlgoritmosOrdenação;


    public class ShellSort {

        public static void main(String[] args) {

            int[] data = {2, 19, 7, 16, 13, 5};
            int n = data.length;

            // Define a sequência de incrementos
            int[] increments = {2, 19, 7, 16, 13, 5};

            // Realiza o Shell Sort utilizando a sequência de incrementos
            for (int i = 0; i < increments.length; i++) {
                int increment = increments[i];
                for (int j = increment; j < n; j++) {
                    int temp = data[j];
                    int k;
                    for (k = j; k >= increment && data[k - increment] > temp; k -= increment) {
                        data[k] = data[k - increment];
                    }
                    data[k] = temp;
                }
            }

            // Imprime o conjunto de dados ordenado
            for (int i = 0; i < n; i++) {
                System.out.print(data[i] + " ");
            }
        }
    }


