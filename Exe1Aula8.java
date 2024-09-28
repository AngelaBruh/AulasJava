/*
 * A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes. Faça um algoritmo para coletar 
 * dados sobre o salário e número de filhos de cada habitante e após as leituras, escrever:
    a. Média de salário da população;
    b. Média do número de filhos;
    c. Maior salário dos habitantes;
    d. Percentual de pessoas com salário menor que R$ 150,00

    Obs.: O final das leituras dos dados se dará com a entrada de um “salário negativo”.
 *  
 */

import java.util.ArrayList;
import java.util.Scanner;
public class Exe1Aula8 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String pesquisa = "n";         
        ArrayList<Double> sla = new ArrayList<>();
        ArrayList<Integer> flh = new ArrayList<>(); //aqui não dá para usar o int tradicional.
       

            
           /*  for(pesquisa != "s"){
            System.out.println("Qual o valor do seu salário atualmente?");
            double salario = leitor.nextDouble();
            sla.add(salario);

            System.out.println("Quantos filhos você tem? ");
            int filho = leitor.nextInt();
            flh.add(filho);

                leitor.nextLine();
            System.out.println("Deseja encerrar pesquisa? (s/n):");
            pesquisa = leitor.nextLine();  
            }*/
                          
              
           
            leitor.close();

            


          
        
       
    }
}
