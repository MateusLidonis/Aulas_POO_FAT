package heranca;

public class PessoaJuridica extends Pessoa{

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    private String cnpj;
    
    public PessoaJuridica() {
    }
    
    public PessoaJuridica(String nome, String endereco, String cnpj) {
        super(nome, endereco);
        this.cnpj = cnpj;
    }
    
    public String toString() {
        return super.toString() + "\nCNPJ: " + getCnpj();
    }
}
