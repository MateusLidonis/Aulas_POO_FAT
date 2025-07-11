/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastropessoa;

/**
 *
 * @author Mateus
 */

import java.util.Scanner;

public class LojaTabajaras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Funcionario funcionario = new Funcionario();
        System.out.println("******************************************************");
        System.out.println("Bem vindos ao sistema de SÓ cadastro da Loja Tabajaras");
        System.out.println("******************************************************");
        
        cliente.cadastraDadosCliente();
        funcionario.cadastraDadosFuncionario();
        System.out.println("======================================");        
        cliente.mostraDadosCliente();
        funcionario.mostraDadosFuncionario();
        System.out.println("======================================");
    }
    
}
