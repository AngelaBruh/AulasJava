/*
 * Desenvolva um programa em Java que leia informações de 5 produtos: nome, quantidade e 
 * preço unitário. Calcule o preço total de cada produto e, ao final, retorne a soma total 
 * de todos os produtos e os nomes de todos os produtos registrados. * 
 * 
 */

import java.util.Scanner;
public class Exe3Aula4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        String[] nomes = new String[5];
        int[] quantidade = new int[5];
        double[] preco = new double[5];     
       
       

        for (int i =0; i < 5; i++){
            System.out.println("Informe o nome do produto:");
            nomes[i] = leitor.nextLine();

            System.out.println("Informe a quantidade de " + nomes[i] + ":");
            quantidade[i] = leitor.nextInt();

            System.out.println("Informe o valor de "+ nomes[i] + ":");
            preco[i] = leitor.nextDouble();          
            leitor.nextLine();
        }       


        System.out.println("\nProdutos adicionados:");
        for (String nome : nomes){           
            System.out.println(nome);
        } 


        
           /*  double soma = 0;
            double mult = 0;
            mult = quantidade[i] * preco[i];

            soma += mult;  
            System.out.println("Valor total: " + soma);  */               
                      
        
        leitor.close();
    }
}
