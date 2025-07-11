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
public class Funcionario {
    int codigoFuncionario;
    String cargo;
    String setor;
    float salario;
    
    public void cadastraDadosFuncionario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("======================================");
        System.out.println("***Cadastro de Funcionário***");
        Pessoa pessoa2 = new Pessoa();
        System.out.println("Insira o nome da pessoa");
        pessoa2.nome = scanner.next();
        System.out.println("Insira o sobrenome da pessoa");
        pessoa2.sobrenome = scanner.next();
        System.out.println("Insira a idade da pessoa");
        pessoa2.idade = scanner.nextInt();
        System.out.println("Insira a data de nascimento da pessoa");
        pessoa2.datanasc = scanner.nextInt();
        
        System.out.println("Insira o código do funcionário");
        codigoFuncionario = scanner.nextInt();
        System.out.println("Insira o cargo do funcionário");
        cargo = scanner.next();
        System.out.println("Insira o setor do funcionário");
        setor = scanner.next();
        System.out.println("Insira o salário do funcionário");
        salario = scanner.nextFloat();
        System.out.println("======================================");

    }
    
    public void mostraDadosFuncionario() {
        System.out.println("Código do funcionário: " + codigoFuncionario + 
                            "\nCargo do funcionário: " + cargo + 
                            "\nSetor do funcionário: " + setor + 
                            "\nSalário do funcionário: " + salario);
    }
}
