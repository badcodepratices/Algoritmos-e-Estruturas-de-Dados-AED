package AlgoritmosEstruturasdeDados.Arvores;

import org.w3c.dom.Node;

public interface arvorebinariapesquisa {
    void adiciona(int dado);
    void pesquisa(int dado);
    void listarPreOrdem(ArvoreBinariadePesquisa.No parente);
    void listarEmOrdem(ArvoreBinariadePesquisa.No parente);
    void listarPosOrdem(ArvoreBinariadePesquisa.No parente);
    void adicionaNo(ArvoreBinariadePesquisa.No parente, int valor);
    void pesquisaNo(ArvoreBinariadePesquisa.No parente, int valor);

}