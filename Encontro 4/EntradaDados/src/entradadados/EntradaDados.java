/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entradadados;

/**
 *
 * @author Mateus
 */
import java.util.Scanner;
//import java.util.Locale;
public class EntradaDados {
	public static void main (String[] args) {
            //Locale.setDefault(Locale.US);
            int codigo;
            String descricao;
            double preco;
            int quantidade;
            double precoTotal;

            Scanner scanner = new Scanner(System.in);

            /*
            Quando usamos o nextInt() ou o nextDouble(), o número é lido pelo programa
            Mas para inserirmos esse número, pressionamos a tecla Enter
            Essa tecla não é lida por essas funções, então ela fica no buffer, na memória
            Quando vamos inserir um campo de texto, nesse caso, a descrição
            O nextLine() vai ler esse Enter que está na memória
            Fazendo com que o programa "pule" essa parte e não registre nada na variável descricao
            Para resolver, basta limparmos o buffer
            Após o NextInt() ou nextDouble()
            Inserimos, na linha de baixo:
            scanner = nextLine()
            Agora podemos voltar a inserir os dados normalmente
            Sempre que usarmos nextInt() ou nextDouble() precisamos limpar o buffer
                CASO O PRÓXIMO CAMPO SEJA UMA STRING
            Ou simplesmente use next() para String
            */


            System.out.println("Digite o codigo do produto: ");
            codigo = scanner.nextInt();
            //scanner.nextLine(); //Explicado acima

            System.out.println("Digite a descricao do produto: ");
            descricao = scanner.next();

            System.out.println("Digite o preco do produto: ");
            preco = scanner.nextDouble();


            System.out.println("Digite a quantidade do produto: ");
            quantidade = scanner.nextInt();


            precoTotal = preco * quantidade;

            System.out.println("Codigo: " + codigo + 
                                "\nDescricao: " + descricao + 
                                "\nPreco: R$" + preco + 
                                "\nQuantidade: " + quantidade + 
                                "\nTotal: R$" + precoTotal);
	}
}
