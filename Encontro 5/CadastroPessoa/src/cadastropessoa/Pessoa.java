/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastropessoa;

/**
 *
 * @author Mateus
 */
public class Pessoa {
    String nome;
    String sobrenome;
    int idade;
    int datanasc;
    
    public void mostraDadosPessoa() {
        System.out.println("Nome da pessoa: " + nome + 
                            "\n Sobrenome da pessoa: " + sobrenome + 
                            "\n Idade da pessoa: " + idade + 
                            "\n Data de nascimento da pessoa: " + datanasc);
    }    
}
