/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encontro7desafio1;

/**
 *
 * @author Mateus
 */
public class Encontro7Desafio1 {
    /*
    O custo de um carro novo ao consumidor é a soma do custo de fábrica 
    com a porcentagem do distribuidor e dos impostos 
    (aplicados ao custo de fábrica). 
    Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%,
    escrever um algoritmo para ler o custo de fábrica de um carro, 
    calcular e escrever o custo final ao consumidor
    */
    public static void main(String[] args) {
        Calculo calculo = new Calculo();
        calculo.recebeCusto();
        calculo.calculaCustoFinal();
    }
    
}
