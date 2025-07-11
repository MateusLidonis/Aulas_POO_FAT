/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tintastabajara;

/**
 *
 * @author Mateus
 */
public class TintasTabajara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalculaTinta tinta = new CalculaTinta();
        tinta.recebeMedidas();
        tinta.calculaTintaNecessaria();
        tinta.exibeTintaNecessaria();
    }
    
}
