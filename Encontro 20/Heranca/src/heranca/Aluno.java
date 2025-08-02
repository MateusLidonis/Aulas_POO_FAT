package heranca;

public class Aluno extends PessoaFisica{

    public String getRa() {
        return ra;
    }
    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    private String ra;
    private String curso;
    
    public Aluno() {
    }
    
    public Aluno(String nome, String endereco, String rg, String cpf, int idade, String ra, String curso) {
        super(nome, endereco, rg, cpf, idade);
        this.ra = ra;
        this.curso = curso;
    }
    
    public String toString() {
        return super.toString() + "\nRA: " + getRa() + 
                            "\n Curso: " + getCurso();
    }
}
