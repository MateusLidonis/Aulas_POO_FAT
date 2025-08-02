package ppr11;

public class Animal {

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    private String nome;
    private int idade;
    private String cor;
    
    public Animal(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }
    
    public void comer() {
        System.out.println(getNome() + " está comendo");
    }
    
    public void dormir() {
        System.out.println(getNome() + " está dormindo");
    }
    
    public String toString() {
        return "Nome: " + getNome() + ", Idade: " + getIdade() + " anos" + ", Cor: " + getCor();
    }
}
