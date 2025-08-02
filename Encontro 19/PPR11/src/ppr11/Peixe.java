package ppr11;

public class Peixe extends Animal{

    public String getTipoAgua() {
        return tipoAgua;
    }
    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }
    
    private String tipoAgua; //Peixe de água salgada ou água doce
    
    public Peixe(String nome, int idade, String cor, String tipoAgua) {
        super(nome, idade, cor);
        this.tipoAgua = tipoAgua;
    }
    
    public void nadar() {
        System.out.println(getNome() + " está nadando");
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Vive em água: " + getTipoAgua();
    }
}
