package AlgoritmosEstruturasdeDados.EstruturadeDadosLineares.ListaLigada;

public class ListaLigada implements ListaLigadaSimples {
    private No head;
    private int tamanho;

    public class No {
        private int dado;
        private No proximo;


        public No(int dado){
            this.dado=dado;
            this.proximo = null;

        }
    }
    public ListaLigada() {
        this.head = null;
        this.tamanho = 0;
    }
    @Override
    public void adicionaInicio(int dado) {
        No novoNo = new No(dado);
        novoNo.proximo = head;
        head = novoNo;
        tamanho++;

    }

    @Override
    public void adicionaPosicao(int posicao, int dado) {
        if (posicao < 0 || posicao > tamanho) {
            throw new IndexOutOfBoundsException();
        }

        if (posicao == 0) {
            adicionaInicio(dado);
        } else {
            No novoNo = new No(dado);
            No corrente = head;
            for (int i = 0; i < posicao - 1; i++) {
                corrente = corrente.proximo;
            }
            novoNo.proximo = corrente.proximo;
            corrente.proximo = novoNo;
            tamanho++;
        }
    }

    @Override
    public void adicionaFim(int dado) {
        adicionaPosicao(tamanho, dado);
    }

    @Override
    public  int pegaNo(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException();
        }

        No corrente = head;
        for (int i = 0; i < posicao; i++) {
            corrente = corrente.proximo;
        }

        return corrente.dado;
    }



    @Override
    public void removeInicio() {
        if (head != null) {
            head = head.proximo;
            tamanho--;
        }

    }

    @Override
    public void removePosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException();
        }

        if (posicao == 0) {
            removeInicio();
        } else {
            No corrente = head;
            for (int i = 0; i < posicao - 1; i++) {
                corrente =  corrente.proximo;
            }
            corrente.proximo = corrente.proximo.proximo;
            tamanho--;
        }

    }

    @Override
    public void removeFim() {
        removePosicao(tamanho - 1);
    }

    @Override
    public boolean contem(int dado) {
        No corrente = head;
        while (corrente != null) {
            if (corrente.dado == dado) {
                return true;
            }
            corrente = corrente.proximo;
        }
        return false;
    }

    @Override
    public int tamanho() {
        return tamanho;
    }
}
