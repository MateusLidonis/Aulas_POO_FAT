package vendas2;

public class Vendedor {

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVendas() {
        return vendas;
    }
    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public double getComissao() {
        return comissao;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    private int codigo;
    private String nome;
    private double vendas;
    private double comissao;

    public Vendedor() {
    }

    public Vendedor(int codigo, String nome, double vendas) {
        this.codigo = codigo;
        this.nome = nome;
        this.vendas = vendas;
        this.comissao = vendas * 0.10;
    }

    public void addVendas(double valor) {
        this.setVendas(this.getVendas() + valor);
        this.setComissao(this.getVendas() * 0.10);
    }

    public String toString() {
        return "Código: " + getCodigo()
                + "\nNome: " + getNome()
                + "\nVendas: R$ " + String.format("%.2f", getVendas())
                + "\nComissão: R$ " + String.format("%.2f", getComissao());
    }
}
