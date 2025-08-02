package banco;

import javax.swing.JOptionPane;

public class Banco {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Informe o nome do titular da conta");
        String conta = JOptionPane.showInputDialog("Informe o número da conta");
        double saldoInicial = Double.parseDouble(JOptionPane.showInputDialog("Qual o saldo inicial?"));
        
        Conta c1 = new Conta(nome, conta, saldoInicial);
        
        double deposito = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor a ser depositado"));
        c1.deposito(deposito);
        
        double saque = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do saque"));
        c1.saque(saque);
        
        JOptionPane.showMessageDialog(null, "Dados da conta após as operações:\n\n" + c1.toString());
    }
    
}
