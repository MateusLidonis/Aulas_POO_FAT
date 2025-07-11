/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastropessoa;

import java.util.Scanner;

/**
 *
 * @author Mateus
 */
public class Cliente {
    int codigoCliente;
    String categoria;
    int cpf;
    String email;
    
    
    public void cadastraDadosCliente() {
        Scanner scanner = new Scanner(System.in);        
        System.out.println("======================================");
        System.out.println("***Cadastro de Clientes***");
        Pessoa pessoa1 = new Pessoa();
        System.out.println("Insira o nome da pessoa");
        pessoa1.nome = scanner.next();
        System.out.println("Insira o sobrenome da pessoa");
        pessoa1.sobrenome = scanner.next();
        System.out.println("Insira a idade da pessoa");
        pessoa1.idade = scanner.nextInt();
        System.out.println("Insira a data de nascimento da pessoa");
        pessoa1.datanasc = scanner.nextInt();
        
        System.out.println("Insira o código do cliente");
        codigoCliente = scanner.nextInt();
        System.out.println("Insira a categoria do cliente");
        categoria = scanner.next();
        System.out.println("Insira o CPF do cliente");
        cpf = scanner.nextInt();
        System.out.println("Insira o e-mail do cliente");
        email = scanner.next();
        System.out.println("======================================");
    }

    public void mostraDadosCliente() {
        System.out.println("Código do cliente: " + codigoCliente + 
                            "\nCategoria do cliente: " + categoria + 
                            "\nCPF: " + cpf + 
                            "\ne-mail: " + email);
    }
}
