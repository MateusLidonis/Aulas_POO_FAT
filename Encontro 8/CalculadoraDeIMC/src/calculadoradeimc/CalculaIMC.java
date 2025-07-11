package calculadoradeimc;

import javax.swing.JOptionPane;

public class CalculaIMC {
    double peso, altura, imc;
    
    public void recebeDados() {
        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso em quilos (Ex. 60.5):"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura em metros (Ex. 1.75):"));
    }
    
    public void calculaIMC() {
        imc = peso / (Math.pow(altura, 2));
        // (Math.pow(altura, 2) == altura * altura 
    }
    
    public void exibeResultado() {
        
        if(imc <= 18.5){
            JOptionPane.showMessageDialog(null, String.format("Seu IMC é de %.2f\nVocê está na magreza", imc));
        } else if(imc >= 18.5 && imc <= 24.9){
            JOptionPane.showMessageDialog(null, String.format("Seu IMC é de %.2f\nVocê está no grau normal", imc));
        } else if(imc >= 25 && imc <= 29.9){
            JOptionPane.showMessageDialog(null, String.format("Seu IMC é de %.2f\nVocê está no sobrepeso", imc));
        } else if(imc >= 30 && imc <= 34.9){
            JOptionPane.showMessageDialog(null, String.format("Seu IMC é de %.2f\nVocê está na obesidade grau I", imc));
        } else if(imc >= 35 && imc <= 39.9){
            JOptionPane.showMessageDialog(null, String.format("Seu IMC é de %.2f\nVocê está na obesidade grau II", imc));
        } else if(imc >= 40){
            JOptionPane.showMessageDialog(null, String.format("Seu IMC é de %.2f\nVocê está na obesidade grau III", imc));
        }
    }
}
