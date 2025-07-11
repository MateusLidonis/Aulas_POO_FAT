package pessoa;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Mateus Lidonis";
        pessoa.idade = 23;
        pessoa.fazAniversario();
        pessoa.mostra();
    }
}
