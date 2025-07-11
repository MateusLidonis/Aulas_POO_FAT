/*
Escreva um algoritmo para imprimir os 10 primeiros números inteiros maiores que 100.
 */
package imprimirinteiros;

import javax.swing.JOptionPane;

public class ImprimirInteiros {

    public static void main(String[] args) {
        String repetir;

        while (true) {

            do {
//DICA
//PARA COMENTAR VÁRIAS LINHAS AO MESMO TEMPO
//SELECIONE AS LINHAS E PRESSIONE CTRL + /
//MESMO COMANDO PARA DESCOMENTAR AS LINHAS

//---------------------------100 FIXO--------------------INÍCIO--------------------------------------------------------------------------                
//                StringBuilder resultado = new StringBuilder("Os 10 números inteiros maiores que 100 são:\n");
//
//                for (int i = 101; i <= 110; i++) {
//                    resultado.append(i);
//                    if (i != 110) {
//                        resultado.append(", ");
//                    }
//
//                }
//                JOptionPane.showMessageDialog(null, resultado.toString());
//---------------------------100 FIXO---------------------FIM----------------------------------------------------------------------------                
//---------------------------PERGUNTA UM NÚMERO----------INÍCIO--------------------------------------------------------------------------
                String entrada = JOptionPane.showInputDialog("Digite um número inteiro:");

                // A entrada é vazia?
                if (entrada != null && !entrada.isEmpty()) {

                    try {
                        int valor = Integer.parseInt(entrada.trim());

                        StringBuilder resultado = new StringBuilder("Os 10 números inteiros após " + valor + " são:\n");

                        for (int i = 1; i <= 10; i++) {
                            //Adiciono o valor digitado + índice na lista
                            resultado.append(valor + i);
                            //Se o índice não for igual à 10, eu posso adicionar uma "," na lista. Se o número for igual à 10, eu pulo essa parte
                            if (i != 10) {
                                resultado.append(", ");
                            }
                        }

                        JOptionPane.showMessageDialog(null, resultado.toString());

                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Número inválido. Por favor, insira um número inteiro.", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum número foi inserido.", "Aviso", JOptionPane.WARNING_MESSAGE);
                }
//---------------------------PERGUNTA UM NÚMERO----------FIM--------------------------------------------------------------------------
                repetir = JOptionPane.showInputDialog("Deseja repetir o programa (S/N)?").trim().toUpperCase();
            } while (repetir.equals("S"));

            break;

        }
    }
}
