package tiaopescador;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Calcula {
    double pesoMaximo = 50, multa = 4, quilos, pesoExcedente, custoTotal;
    String custoTotalFormatado;
    
    public void recebeDados() {
        quilos = Double.parseDouble(JOptionPane.showInputDialog("Quantos quilos de peixe você pescou hoje, Tião?"));
    }
    
    public void calculaMulta() {
        if(quilos > pesoMaximo){
            pesoExcedente = quilos - pesoMaximo;
            custoTotal = pesoExcedente * multa;
            
            DecimalFormat df = new DecimalFormat("#,###.00");
            custoTotalFormatado = df.format(custoTotal);
            
            JOptionPane.showMessageDialog(null, "Vish Tião... Vai ter que pagar R$" + custoTotalFormatado);
        } else{
            JOptionPane.showMessageDialog(null, "Ufa, ta dentro do limite");
        }
    }
}
