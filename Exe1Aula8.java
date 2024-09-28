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
        String pesquisa = "s";
        double somaS = 0;
        int somaF = 0;  
      
        ArrayList<Double> sla = new ArrayList<>();
        ArrayList<Integer> flh = new ArrayList<>(); //aqui não dá para usar o int tradicional.
                   
           
            while(pesquisa.equalsIgnoreCase("s")){
                System.out.println("Qual o valor do seu salário atualmente?");
                double salario = leitor.nextDouble();
                sla.add(salario);

                System.out.println("Quantos filhos você tem? ");
                int filho = leitor.nextInt();
                flh.add(filho);    
                
                leitor.nextLine();
                System.out.println("Deseja continuar a pesquisa (s/n):");
                pesquisa = leitor.nextLine();
            }   
            
            for(double sal: sla){ //somando salarios para media
                somaS += sal;
            }
            for(int fil: flh){ //somando filhos para media
                somaF += fil;
            }
            
            double mediaS = somaS / sla.size();
            System.out.println("Média salarial da população: " + mediaS);
            double mediaF = somaF / flh.size();
            System.out.println("Média de filhos da população: " + mediaF);
            
            double maiorSalario = sla.get(0); // Inicializa com o primeiro salário da lista
            for(double sal: sla){
                if(sal > maiorSalario){
                    maiorSalario = sal;
                }
            }
            System.out.println("Maior salário informado: " + maiorSalario);
            
            int countMenor150 = 0; // aqui estou contando quantos salarios menores que 150 existem
            for(double sal: sla){
                if(sal < 150.00){
                    countMenor150++;
                }
            }
            double percentual = ((double) countMenor150 / sla.size()) * 100; //calculo percentual, o 100 é porcentagem
            System.out.println("Percentual de pessoas com salário menor que R$ 150,00: " + percentual + "%");
            
           
        leitor.close();             
    }
}
