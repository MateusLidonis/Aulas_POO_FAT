/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consumocombustivel;

/**
 *
 * @author Mateus
 */
public class Calcula {
    float distancia;
    int combustivel;
    float consumoMedio;
    
    public void calculo() {
        consumoMedio = distancia / combustivel;
        System.out.println("O consumo de combustível foi de " + consumoMedio + " Km/L");               
    }                   
}
