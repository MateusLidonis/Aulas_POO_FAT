package usaloja;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UsaLoja {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Loja loja = new Loja();

        try {
            System.out.println("Digite o código do produto");
            loja.setCodigo(scanner.nextInt());
            scanner.nextLine();

            System.out.println("Digite a descrição do produto");
            loja.setDescricao(scanner.nextLine());

            System.out.println("Digite a quantidade atual em estoque");
            loja.setQuantidade(scanner.nextInt());
            scanner.nextLine();

            System.out.println("\n--- Dados Inseridos ---");
            System.out.println(loja);
            System.out.println(loja.statusEstoque());
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Use apenas números inteiros");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();

        }

    }

}
