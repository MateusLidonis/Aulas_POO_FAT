package bancopolimorfismo;

import java.util.ArrayList;

public class BancoPolimorfismo {

    public static void main(String[] args) {
        ArrayList<ContaCorrente> contas = new ArrayList<>();
        
        ContaCorrente cc1 = new ContaCorrente(1, "Mateus", 100);
        ContaEspecial ce1 = new ContaEspecial(2, "Pipi", 100, 100);
        
        contas.add(cc1);
        contas.add(ce1);
        
        // Depositar 500 em todas as contas dentro do ArrayList
        for (int i = 0; i < contas.size(); i++) {
            contas.get(i).depositar(500);
        }
        
        // Sacar 200 de todas as contas dentro do ArrayList
        for (int i = 0; i < contas.size(); i++) {
            contas.get(i).sacar(190);
        }
        
        for (int i = 0; i < contas.size(); i++) {
            ContaCorrente showConta = contas.get(i);
            System.out.println("Classe real: " + showConta.getClass());
            System.out.println(showConta);
            System.out.println("Saldo atual: R$ " + showConta.obterSaldo());
            System.out.println("-----------------------------------------");
            
        }
    }
    
}
