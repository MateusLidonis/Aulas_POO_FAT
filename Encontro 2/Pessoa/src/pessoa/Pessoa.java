package pessoa;

public class Pessoa {
    String nome;
    int idade;

    public void mostra() {
        System.out.println("Nome: " + nome + "\nIdade: " + idade);
    }

    public void fazAniversario() {
        idade++;
    }
}
