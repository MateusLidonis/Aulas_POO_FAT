/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consumocombustivel;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Mateus
 */
public class ConsumoCombustivel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calcula calcula = new Calcula();
        
        System.out.println("Informe o combustivel gasto: ");
        calcula.combustivel = scanner.nextInt();
        System.out.println("Informe a distancia: ");
        calcula.distancia = scanner.nextFloat();
        calcula.calculo();             
    }    
}
