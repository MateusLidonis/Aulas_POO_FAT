package banco;

public class Conta implements ContasDeBanco{

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNrconta() {
        return nrconta;
    }
    public void setNrconta(String nrconta) {
        this.nrconta = nrconta;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    private String nome;
    private String nrconta;
    private double saldo;
    
    public Conta(String nome, String nrconta, double saldo) {
        this.nome = nome;
        this.nrconta = nrconta;
        this.saldo = saldo;
    }
    
    @Override
    public void saque(double valor) {
        double taxa = pagarCPMF(valor);
        double total = valor + taxa;
        if(total <= getSaldo()){
            setSaldo(getSaldo() - total);
            System.out.println("Saque de R$ " + valor + " realizado!");
            System.out.println("CPMF descontado: R$ " + taxa);
        } else {
            System.out.println("Saldo insuficiente para saque de R$ " + valor);
        }
    }
    
    @Override
    public void deposito(double valor) {
        setSaldo(getSaldo() + valor);
        System.out.println("Depósito de R$ " + valor + " realizado!");
    }
    
    @Override
    public double pagarCPMF(double valor){
        return valor * aliquota / 100;
    }
    
    @Override
    public String toString() {
        return "Nome: " + getNome() +
               "\nConta: " + getNrconta() + 
               "\nSaldo: R$ " + String.format("%.2f", getSaldo());
    }
}
