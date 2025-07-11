/*
Exercício: Calculadora de Preços com Formatação
Imagine que você está desenvolvendo um programa para calcular o preço total 
de um produto, incluindo impostos. 
O preço final deve ser exibido no formato "R$ 0,00" 
(com duas casas decimais e separador de milhar).

Requisitos:
O programa deve:
- Receber o preço base do produto (exemplo: 1234.567).
- Calcular o preço final com um imposto de 10%.
- Exibir o preço final formatado como "R$ 1.357,02".
- Use a classe DecimalFormat para formatar o número.

Dica:
O imposto pode ser calculado assim: precoFinal = precoBase + (precoBase * 0.10);
O padrão de formatação será: "R$ #,###.00"
*/

package calculadoracomformatacao;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class CalculadoraComFormatacao {
    public static void main(String[] args) {
        float precoBase, precoFinal, imposto = 10;
        String precoFormatado;
        
        DecimalFormat df = new DecimalFormat("#,###.00");
        
        precoBase = Float.parseFloat(JOptionPane.showInputDialog("Qual é o preço base do produto?"));
        precoFinal = precoBase * (1 + imposto/100);
        precoFormatado = df.format(precoFinal);
        JOptionPane.showMessageDialog(null, "O valor final do produto, com o imposto de 10% aplicado é R$" + precoFormatado);
    }
    
}
