/*
 * Desenvolva um sistema que leia a quantidade de produtos e o valor unitário, retornando o valor total.
 */

 import java.util.Scanner;
public class Exe8Aula7 {
    public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            double valorTotal = 0.0;
            String continuar = "s";
            String produto;

        for (; continuar.equalsIgnoreCase("s");){ //equalsIgnoreCase - ele ignora o fato da letra ser maiuscula ou minuscula
            System.out.println("Informe o produto: ");
            produto = leitor.nextLine();

            System.out.print("Digite a quantidade de " + produto + ":");
            int quantidade = leitor.nextInt();

            System.out.print("Digite o valor unitário de " + produto + ":");
            double valorUnitario = leitor.nextDouble();

            valorTotal += quantidade * valorUnitario;

            System.out.print("Deseja adicionar mais produtos? (s/n): ");
            continuar = leitor.next();
            leitor.nextLine();
            leitor.close();
        }

        System.out.println("O valor total é: R$ " + valorTotal);
        leitor.close();
    }

}          
