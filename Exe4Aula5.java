/*
 * Desenvolva um programa em Java que verifique se uma pessoa é maior ou menor de idade.
 */


import java.util.Scanner;
public class Exe4Aula5{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        

        System.out.println("Informe sua idade: ");
        int idade = leitor.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println(" Você é menor de idade.");
        }
         leitor.close();
    }
}