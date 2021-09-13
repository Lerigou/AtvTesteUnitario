package sample.model;

public class Produto {

    private String nome;
    private int qtd;
    private double valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produtos " + '\'' +
                "nome: " + nome + '\'' +
                ", qtd: " + qtd +
                ", valor: " + valor;
    }
}
