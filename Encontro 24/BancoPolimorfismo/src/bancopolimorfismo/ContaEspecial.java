package bancopolimorfismo;

public class ContaEspecial extends ContaCorrente{

    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    private double limite;
    
    public ContaEspecial(int codigo, String nome, double saldoInicial, double limite) {
        super(codigo, nome, saldoInicial);
        this.limite = limite;
    }
    
    @Override
    public void sacar(double valor) {
        double taxa = valor * 0.001;
        double total = valor + taxa;
        if(total <= getSaldo() + getLimite()) {
            setSaldo(getSaldo() - total);
        }
    }
    
    @Override
    public String toString() {
        return "Conta Especial (" +
                "Código: " + getCodigo() +
                ", Nome: " + getNome() +
                ", Saldo: " + getSaldo() + 
                ", Limite: " + getLimite() + ")";
    }
}
