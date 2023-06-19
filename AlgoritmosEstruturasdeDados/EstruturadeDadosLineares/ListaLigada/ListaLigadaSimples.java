package AlgoritmosEstruturasdeDados.EstruturadeDadosLineares.ListaLigada;

public interface ListaLigadaSimples {
    void adicionaInicio(int dado);

    void adicionaPosicao(int posicao, int dado);

    void adicionaFim(int dado);

    int pegaNo(int posicao);

    void removeInicio();

    void removePosicao(int posicao);

    void removeFim();

    boolean contem(int dado);

    int tamanho();
}
