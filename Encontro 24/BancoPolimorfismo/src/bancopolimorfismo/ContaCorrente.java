package bancopolimorfismo;

public class ContaCorrente {
    int codigo;
    String nome;
    double saldo;
    
    public ContaCorrente(int codigo, String nome, double saldoInicial) {
        this.codigo = codigo;
        this.nome = nome;
        this.saldo = saldoInicial;
    }
    
    public void depositar(double valor) {
        if(valor > 0) {
            saldo += valor;
        }
    }
    
    public void sacar(double valor) {
        double taxa = valor * 0.005;
        double total = valor + taxa;
        if(total <= saldo) {
            saldo -= total;
        }
    }
    
    public double obterSaldo() {
        return saldo;
    }
    
    @Override
    public String toString() {
        return "Conta Corrente (" +
                "Código: " + codigo +
                ", Nome: " + nome +
                ", Saldo: " + saldo + ")";
    }
}
