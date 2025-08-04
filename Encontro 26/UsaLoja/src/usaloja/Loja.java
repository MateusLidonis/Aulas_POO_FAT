package usaloja;

public class Loja {

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    private int codigo;
    private String descricao;
    private int quantidade;
    
    final int EST_MIN = 10;
    final int EST_MAX = 50;
    
    public Loja() {
    }
    
    public Loja(int codigo, String descricao, int quantidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }
    
    private boolean verificaCompra() {
//        if(quantidade < (EST_MIN + EST_MAX) / 2){
//            return true;
//        } else {
//            return false;
//        }
        
        return getQuantidade() < (EST_MIN + EST_MAX) / 2;
    }
    
    private int comprar() {
        return EST_MAX - getQuantidade();
    }
    
    public String statusEstoque() {
        if(verificaCompra()) {
            return "Necessário comprar " + comprar() + " unidades.";
        } else {
            return "Estoque suficiente.";
        }
    }
    
    @Override
    public String toString() {
        return "Loja (" + 
                "Código: " + getCodigo() + 
                ", Descrição: " + getDescricao() + 
                ", Quantidade: " + getQuantidade() + ")";
    }
}
