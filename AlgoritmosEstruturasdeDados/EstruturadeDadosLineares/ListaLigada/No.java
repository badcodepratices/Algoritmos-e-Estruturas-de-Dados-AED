package AlgoritmosEstruturasdeDados.EstruturadeDadosLineares.ListaLigada;

public class No {
    private int dado;
    private No proximo;

    public No(int dado){
        this.dado =dado;
        this.proximo=null;
    }



    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public int getDado() {
        return dado;
    }
}
