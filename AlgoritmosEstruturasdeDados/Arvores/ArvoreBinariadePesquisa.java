package AlgoritmosEstruturasdeDados.Arvores;

public class ArvoreBinariadePesquisa {
    No raiz;
    int tamanho;

    public class No {
        No esquerda;
        No direita;

        int dado;

        public No(int dado) {
            this.dado = dado;
            this.esquerda = esquerda;
            this.direita = direita;
        }
    }

    public ArvoreBinariadePesquisa() {
        this.raiz = null;
        this.tamanho = 0;
    }

    public void adiciona(int dado){
        if (this.raiz == null){
            this.raiz = new No(dado);
        }
        else{
            adicionaNo(this.raiz,dado);
        }
    }

    private void adicionaNo(No parente, int dado) {
        if(dado < parente.dado){
            if (parente.esquerda == null){
                parente.esquerda = new No(dado);
            }else{
                adicionaNo(parente.esquerda,dado);
            }
        }else if (dado > parente.dado){
            if (parente.direita == null){
                parente.direita = new No(dado);
            }else{
                adicionaNo(parente.direita,dado);
            }
            }
        else{
            System.out.print("Item inexistente");
        }
    }
    public void listarPreOrdem(No parente){
        System.out.print(parente.dado + " ");
        if ((parente.esquerda).esquerda == null && (parente.esquerda).direita == null){
            System.out.print(parente.esquerda.dado + " ");
        }
        else {
            listarPreOrdem(parente.esquerda);
        }

        if ((parente.direita).esquerda == null && (parente.direita).direita == null){
            System.out.print(parente.direita.dado + " ");
        }else {
            listarPreOrdem(parente.direita);
        }
    }

    public void listarEmOrdem(No parente){
        if (parente != null){
            listarEmOrdem(parente.esquerda);
            System.out.print(parente.dado + " ");
            listarEmOrdem(parente.direita);
        }
    }

    void listarPosOrdem(No parente){
        if (parente != null){
            listarPosOrdem(parente.esquerda);
            listarPosOrdem(parente.direita);
            System.out.print(parente.dado + " ");
        }
    }
    public void pesquisa(int valor){
        if (this.raiz == null){
            System.out.print("Árvore vâzia");
        }
        else {
            pesquisaNo(this.raiz,valor);
        }
    }

    private void pesquisaNo(No parente, int valor) {
        if (parente != null){
            if (valor < parente.dado){
                pesquisaNo(parente.esquerda, valor);
            } else if (valor > parente.dado) {
                pesquisaNo(parente.direita,valor);
            }
            else {
                System.out.print("O elemento "+valor+" encontrado");
            }
        }
        else{
            System.out.print("O elemento "+valor+ " não encontrado");
        }
    }
}

