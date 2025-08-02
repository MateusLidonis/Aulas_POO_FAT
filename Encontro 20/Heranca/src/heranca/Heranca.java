package heranca;

public class Heranca {

    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("Pipi", "Rua da Pipi 51", "123456789", "111.222.333-45", 4);
        PessoaJuridica pj = new PessoaJuridica("Loja da Pipi PJ", "Avenida Governadora Pipi, 8000", "12.345.678/0001-99");
        Aluno aluno = new Aluno("Aluna Pipi", "Rua Estudante Pipi, 123", "987654321", "555.444.333-21", 4, "RA123456789", "Engenharia de Tudo");
        
        System.out.println("--- Pessoa Física ---");
        System.out.println(pf);
        
        System.out.println("\n\n--- Pessoa Jurídica ---");
        System.out.println(pj);        
        
        System.out.println("\n\n--- Aluno ---");
        System.out.println(aluno);
    }
    
}
