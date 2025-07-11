package corparatexto;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class CorParaTexto {

    public static void main(String[] args) {
        int R, G, B, soma;
        String RGB;
        
        JOptionPane.showMessageDialog(null, "Bem vindo ao óculos para daltônicos"
                + "\nVocê deve digitar três porcentagens de cores"
                + "\nR G B (Vermelho Verde Azul)"
                + "\nExemplo: 40 60 20");
        RGB = JOptionPane.showInputDialog("Digite as cores separadas por um espaço simples, devem ser números inteiros");
        String[] mistura = RGB.split(" ");

        if (mistura.length == 3) {
            try {
                R = Integer.parseInt(mistura[0]);
                G = Integer.parseInt(mistura[1]);
                B = Integer.parseInt(mistura[2]);

                if (R <= 100 && G <= 100 && B <= 100) {

                    soma = R + B + G;

                    String[] nomesCores = {
                        "Vermelho", //0
                        "Verde", //1
                        "Azul",//2
                        "Preto"}; //3

                    String[] nomesCoresMisturadas = {
                        "Vermelho esverdeado", //0
                        "Vermelho azulado", //1
                        "Verde avermelhado", //2
                        "Verde azulado", //3
                        "Azul avermelhado", //4
                        "Azul esverdeado"};     //5

                    //Primeira condição
                    if (R >= 60 || G >= 60 || B >= 60) {
                        if (R >= 60) {
                            JOptionPane.showMessageDialog(null, "A cor predominante é " + nomesCores[0]);
                        } else if (G >= 60) {
                            JOptionPane.showMessageDialog(null, "A cor predominante é " + nomesCores[1]);
                        } else if (B >= 60) {
                            JOptionPane.showMessageDialog(null, "A cor predominante é " + nomesCores[2]);
                        }
                        //Segunda condição
                    } else if (soma < 40) {
                        JOptionPane.showMessageDialog(null, "A cor predominante é " + nomesCores[3]);
                        //Terceira condição
                    } else {
                        //Daria pra usar Bubble Sort aqui, mas eu não consegui entender para implementar

                        if (R > G && G > B) {
                            JOptionPane.showMessageDialog(null, "A cor é " + nomesCoresMisturadas[0]);
                        } else if (R > B && B > G) {
                            JOptionPane.showMessageDialog(null, "A cor é " + nomesCoresMisturadas[1]);
                        } else if (G > R && R > B) {
                            JOptionPane.showMessageDialog(null, "A cor é " + nomesCoresMisturadas[2]);
                        } else if (G > B && B > R) {
                            JOptionPane.showMessageDialog(null, "A cor é " + nomesCoresMisturadas[3]);
                        } else if (B > R && R > G) {
                            JOptionPane.showMessageDialog(null, "A cor é " + nomesCoresMisturadas[4]);
                        } else if (B > G && G > R) {
                            JOptionPane.showMessageDialog(null, "A cor é " + nomesCoresMisturadas[52]);
                        }
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Valor incorreto, deve ser menor ou igual à 100");
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Você deve inserir apenas números inteiros", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Você deve inserir apenas 3 valores", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

}
