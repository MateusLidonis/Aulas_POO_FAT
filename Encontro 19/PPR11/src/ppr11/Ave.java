package ppr11;

public class Ave extends Animal {

    public boolean isSabeVoar() {
        return sabeVoar;
    }
    public void setSabeVoar(boolean sabeVoar) {
        this.sabeVoar = sabeVoar;
    }

    private boolean sabeVoar;

    public Ave(String nome, int idade, String cor, boolean sabeVoar) {
        super(nome, idade, cor);
        this.sabeVoar = sabeVoar;
    }

    public void cantar() {
        System.out.println(getNome() + " está cantando: Piu piu!");
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Sabe voar: " + (isSabeVoar() ? "Sim" : "Não");
    }

}
