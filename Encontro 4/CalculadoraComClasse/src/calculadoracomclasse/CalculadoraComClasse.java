/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoracomclasse;

/**
 *
 * @author Mateus
 */
import java.util.Scanner;
public class CalculadoraComClasse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operacoes operacoes = new Operacoes();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número");
        operacoes.primeiroNumero = scanner.nextDouble();
        System.out.println("Digite o segundo número");
        operacoes.segundoNumero = scanner.nextDouble();

        operacoes.Soma();
        operacoes.Subtracao();
        operacoes.Multiplicacao();
        operacoes.Divisao();
            
    }
    
}
