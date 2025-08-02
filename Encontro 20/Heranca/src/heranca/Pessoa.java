package heranca;

public class Pessoa {

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    private String nome;
    private String endereco;
    
    public Pessoa() {
    }
    
    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    
    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nEndereço: " + getEndereco();
    }
}
