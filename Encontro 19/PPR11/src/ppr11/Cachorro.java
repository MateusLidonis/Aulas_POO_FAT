package ppr11;

public class Cachorro extends Animal {

    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    private String raca;
    
    public Cachorro(String nome, int idade, String cor, String raca) {
        super(nome, idade, cor);
        this.raca = raca;
    }
    
    public void latir() {
        System.out.println(getNome() + " está latindo: Au au!");
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Raça: " + getRaca();
    }
}
