/*
 * Desenvolva um programa em Java que leia informações de 5 produtos: nome, quantidade e 
 * preço unitário. Calcule o preço total de cada produto e, ao final, retorne a soma total 
 * de todos os produtos e os nomes de todos os produtos registrados. * 
 * 
 */

import java.util.Scanner;
public class Exe3Aula4 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        String[] nomes = new String[5];
        int[] quantidade = new int[5];
        double[] preco = new double[5];     
        double[] mult = new double[5];
        
       
       

        for (int i = 0; i < 5; i++){
            System.out.println("Informe o nome do produto:");
            nomes[i] = leitor.nextLine();

            System.out.println("Informe a quantidade de " + nomes[i] + ":");
            quantidade[i] = leitor.nextInt();

            System.out.println("Informe o valor de "+ nomes[i] + ":");
            preco[i] = leitor.nextDouble();          
            leitor.nextLine(); //limpar buffer do scanner, isso evita que o programa pule o proximo passo.

            mult[i] = quantidade[i] * preco[i];           
        }       

        System.out.println("\nProdutos adicionados:");
        for (String nome : nomes){           // " nome " - variavel criada dentro do for; " nomes " - variavel criada lá em cima.
            System.out.println(nome);
        }        
        
        double total = 0;
        for (double mults : mult){            
            total += mults;  // para somar variavel do for.
        } 
        System.out.println("Valor total: " + total);

        leitor.close();
    }
}
