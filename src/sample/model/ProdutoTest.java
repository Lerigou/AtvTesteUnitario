package sample.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProdutosTest {

    @Test
    public void testeProduto(){
        Produto produto = new Produto();
        produto.setNome("Rosquinha");
        assertEquals("Rosquinha", produto.getNome());
        produto.setQtd(3);
        assertEquals(3, produto.getQtd());
        produto.setValor(1.50);
        assertEquals(1.50, produto.getValor());
    }
}