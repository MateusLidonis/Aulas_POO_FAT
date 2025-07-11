package invertervalores;

import javax.swing.JOptionPane;

public class InverterValores {

    public static void main(String[] args) {
        int n1=3, n2=0;
        
        if(n1>n2){
            int aux = n1;
            n1 = n2;
            n2 = aux;
            System.out.println("O número " + n2 + " é maior que o número " + n1);
        } else if(n1 == n2){
            System.out.println("O número " + n2 + " é igual ao número " + n1);
        }else {
            System.out.println("A condição não foi atendida");
        }
    }
}
