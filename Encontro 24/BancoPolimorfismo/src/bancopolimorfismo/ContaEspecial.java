package bancopolimorfismo;

public class ContaEspecial extends ContaCorrente{
    double limite;
    
    public ContaEspecial(int codigo, String nome, double saldoInicial, double limite) {
        super(codigo, nome, saldoInicial);
        this.limite = limite;
    }
    
    @Override
    public void sacar(double valor) {
        double taxa = valor * 0.001;
        double total = valor + taxa;
        if(total <= saldo + limite) {
            saldo -= total;
        }
    }
    
    @Override
    public String toString() {
        return "Conta Especial (" +
                "Código: " + codigo +
                ", Nome: " + nome +
                ", Saldo: " + saldo + 
                ", Limite: " + limite + ")";
    }
}
