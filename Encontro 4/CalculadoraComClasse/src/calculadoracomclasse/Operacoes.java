/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoracomclasse;

/**
 *
 * @author Mateus
 */
public class Operacoes {
    double primeiroNumero;
    double segundoNumero;
    double resultado;
    
    public void Soma() {
        resultado = primeiroNumero + segundoNumero;
        System.out.println("O resultado da soma é: " + resultado);
    }
    
    public void Subtracao() {
        resultado = primeiroNumero - segundoNumero;
        System.out.println("O resultado da subtração é: " + resultado);
    }
    
    public void Multiplicacao() {
        resultado = primeiroNumero * segundoNumero;
        System.out.println("O resultado da multiplicação é: " + resultado);
    }
    
    public void Divisao() {
        resultado = primeiroNumero / segundoNumero;
        System.out.println("O resultado da divisão é: " + resultado);
    }
}
