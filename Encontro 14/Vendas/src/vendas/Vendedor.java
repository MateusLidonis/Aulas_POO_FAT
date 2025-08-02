package vendas;

public class Vendedor {

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

    private double comissao;
    private double vendas;
    
    public void addVendas(double valor) {
        setVendas(getVendas() + valor);
    }
    
    public void calculaComissao() {
        setComissao(getVendas() * 0.10);
    }
}
