package AlgoritmosEstruturasdeDados.EstruturadeDadosLineares.ListaDuplamenteLigadas;

public class ListaDuplamenteLigada {
    private No head;
    private No tail;
    private int tamanho;
    public class No{
        private int data;
        private No proximo;
        private No anterior;

        public No(int data){
            this.data = data;
            this.proximo = null;
            this.anterior = null;
        }

    }
    public ListaDuplamenteLigada(){
        head.proximo = tail;
        tail.anterior = head;
        this.tamanho = 0;
    }

    public void adicionaInicio(int dado){
        No novoNO = new No(dado);
        novoNO.proximo = head;
        novoNO.anterior = null;
        if (head != null){
            head.anterior = novoNO;
        }
        head=novoNO;
        if (tamanho == 0){
            tail = head;
        }
        tamanho++;
    }
}
