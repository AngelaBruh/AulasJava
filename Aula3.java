/*
 *  Faça um sistema em Java para a leitura dos nomes de 5 funcionários e em seguida mostre o 
 *  nome digitado desse funcionários.
 */



    import java.util.Scanner;
public class Aula3 {
    public static void main(String[] args) {
        //Estou escrevendo o meu codigo java
        
        Scanner leitorTxt = new Scanner (System.in);
        System.out.println("Informe o nome do primeiro funcionario:");
        String nome1 = leitorTxt.nextLine();
        System.out.println("O primeiro funcionário chama-se: "+nome1);

        System.out.println("\nInforme o nome do segundo funcionario:");
        String nome2 = leitorTxt.nextLine();
        System.out.println("O segundo funcionário chama-se: "+nome2);

        System.out.println("\nInforme o nome do terceiro funcionario:");
        String nome3 = leitorTxt.nextLine();
        System.out.println("O terceiro funcionário chama-se: "+nome3);

        System.out.println("\nInforme o nome do quarto funcionario:");
        String nome4 = leitorTxt.nextLine();
        System.out.println("O quarto funcionário chama-se: "+nome4);

        System.out.println("\nInforme o nome do quinto funcionario:");
        String nome5 = leitorTxt.nextLine();
        System.out.println("O quinto funcionário chama-se: "+nome5);
        leitorTxt.close();
    }
}
