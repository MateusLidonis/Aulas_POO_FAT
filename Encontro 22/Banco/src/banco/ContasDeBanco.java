package banco;

public interface ContasDeBanco extends EntidadeFinanceira{
    void saque(double valor);
    void deposito(double valor);
}
