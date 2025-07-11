package loopmedia;

import javax.swing.JOptionPane;

public class LoopMedia {

    public static void main(String[] args) {
        double numero, soma = 0, conta = 0, media;

        //O primeiro número digitado, também será o limite de inputs
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número (limite):"));

        //Como é o primeiro e está fora do loop, eu já calculo aqui manualmente
        double totalEntradas = numero;
        soma += numero;
        conta = 1;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
            //Se o número digitado for 0, para o programa
            if (numero == 0) {
                break;
            }
            //Se for qualquer outro número, adiciona na contagem e na soma
            soma += numero;
            conta++;

            //Vai ficar no loop até a contagem ser menor do que a quantidade inserido pela primeira vez (limite)
        } while (conta < totalEntradas);
 
        media = soma / conta;
        JOptionPane.showMessageDialog(null, "A média é " + media
                + "\nA soma é " + soma
                + "\nForam inseridos " + conta + " números");
//        do {            
//            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
//            soma += numero;
//            conta++;
//        } while (numero != 0);
//        media = soma / conta;
//        JOptionPane.showMessageDialog(null,"A média é " + media
//        + "\nA soma é " + soma
//        + "\nForam inseridos " + conta + " números");
    }
}
