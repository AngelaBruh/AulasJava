

//Desenvolva um programa em Java que verifique se uma pessoa é maior ou menor de idade, ainda se já é idoso ou não.

import java.util.Scanner;
public class Exe4Aula7 {   
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade;

        System.out.println("Verificação de maior de idade");
        System.out.println("Informe sua idade: ");
        idade = leitor.nextInt();

        if (idade >= 18 && idade < 60) {
            System.out.println("Você é maior de idade.");           
        }else if(idade >= 60){
            System.out.println("Você é idoso(a).");
        }
        else {
            System.out.println("Você é menor de idade.");
        }      
        
        
        
        



    leitor.close();
    }
}
