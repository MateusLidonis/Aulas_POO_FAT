package heranca;

public class PessoaFisica extends Pessoa{
    
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    private String rg;
    private String cpf;
    private int idade;
    
    public PessoaFisica() {
    }
    
    public PessoaFisica(String nome, String endereco, String rg, String cpf, int idade) {
        super(nome, endereco);
        this.rg = rg;
        this.cpf = cpf;
        this.idade = idade;
    }
    
    public String toString() {
        return super.toString() + "\nRG: " + getRg() +
                                  "\nCPF: " + getCpf() + 
                                  "\nIdade: " + getIdade();
    }
}
