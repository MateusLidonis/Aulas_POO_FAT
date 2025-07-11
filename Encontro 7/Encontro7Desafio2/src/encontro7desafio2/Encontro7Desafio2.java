/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encontro7desafio2;

/**
 *
 * @author Mateus
 */
public class Encontro7Desafio2 {
    /*
    Uma revendedora de carros usados paga a seus funcionários vendedores 
    um salário fixo por mês, mais uma comissão também fixa para cada carro 
    vendido e mais 5% do valor das vendas por ele efetuadas. 
    Escrever um algoritmo que leia o número de carros por ele vendidos, 
    o valor total de suas vendas, o salário fixo 
    e o valor que ele recebe por carro vendido. 
    Calcule e escreva o salário final do Vendedor
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculo calculo = new Calculo();
        calculo.recebeDados();
        calculo.calculoFinal();
    }
    
}
