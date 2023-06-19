package AlgoritmosEstruturasdeDados.EstruturadeDadosLineares.ListaSequencial;

public class ListaSequencial {
    private int tamanho;
    private int [] listasequencial;

    public ListaSequencial(int capacidade){

        this.listasequencial=new int[capacidade];
        this.tamanho = 0;


    }
    public boolean adicionaElemento(int elemento){
        if(this.tamanho < listasequencial.length){
            this.listasequencial[this.tamanho] = elemento;
            this.tamanho ++;
            return true;
        }
        else {
            return false;
        }
    }
    public void listAll(){
        int i=0;
        while( i <listasequencial.length){
            System.out.print(listasequencial[i]+",");
            i++;
        }

    }
    public boolean removeElemento(int elemento){
        int index = elementoExiste(elemento);
        if (index!=-1){
            for (int i = index; i < this.tamanho-1; i++) {

                    listasequencial[i] = listasequencial[i + 1];
                }
            this.tamanho--;
            return true;
        }

        else {
            return false;
        }
    }
    public boolean adicionaPosicao(int elemento, int index){
        return true;
    }
    public boolean insertManly(int []element){
        return true;
    }
    public boolean removeAt(int index){
        return true;

    }
    public int elementoExiste(int elemento){
        for(int i = 0;i<tamanho;i++)
            if (this.listasequencial[i]==elemento)
                return i;
        return -1;
    }
    public int tamanho(){
        return tamanho;
    }
    public String toString(){
        String s;
        s = "[";
        if (this.tamanho > 0) s += this.listasequencial[this.tamanho];
        if (this.tamanho > 1){
            for (int i = 1; i < this.tamanho - 1; i++) {
                s += ", " + this.listasequencial[this.tamanho];
            }
        }
        return s + "]";
    }

    
}
