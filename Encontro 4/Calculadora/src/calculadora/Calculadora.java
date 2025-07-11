/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author Mateus
 */

import java.util.Scanner;

public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double primeiroNumero;
        double segundoNumero;
        double resultado;
        
        Scanner scanner = new Scanner(System.in);        
        
        System.out.println("Digite o primeiro numero: ");
        primeiroNumero = scanner.nextDouble();
        
        System.out.println("Digite o segundo numero: ");
        segundoNumero = scanner.nextDouble();
        
        resultado = primeiroNumero + segundoNumero;
        System.out.println("Soma: " + resultado);
        
        resultado = primeiroNumero - segundoNumero;
        System.out.println("Subtracao: " + resultado);
        
        resultado = primeiroNumero * segundoNumero;
        System.out.println("Multiplicacao: " + resultado);
        
        resultado = primeiroNumero / segundoNumero;
        System.out.println("Divisao: " + resultado);
    }
    
}
