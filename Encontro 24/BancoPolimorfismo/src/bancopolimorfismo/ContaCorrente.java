package bancopolimorfismo;

public class ContaCorrente {

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

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    private int codigo;
    private String nome;
    private double saldo;
    
    public ContaCorrente(int codigo, String nome, double saldoInicial) {
        this.codigo = codigo;
        this.nome = nome;
        this.saldo = saldoInicial;
    }
    
    public void depositar(double valor) {
        if(valor > 0) {
            setSaldo(getSaldo() + valor);
        }
    }
    
    public void sacar(double valor) {
        double taxa = valor * 0.005;
        double total = valor + taxa;
        if(total <= getSaldo()) {
            setSaldo(getSaldo() - total);
        }
    }
    
    public double obterSaldo() {
        return getSaldo();
    }
    
    @Override
    public String toString() {
        return "Conta Corrente (" +
                "Código: " + getCodigo() +
                ", Nome: " + getNome() +
                ", Saldo: " + getSaldo() + ")";
    }
}
