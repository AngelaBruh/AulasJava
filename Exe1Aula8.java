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


import java.util.Scanner;
public class Exe1Aula8 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // int[] filho;
        //double[] salar;
        String finalizar = "s";
        int mediaF;
        int mediaS;

        for (; finalizar.equals("s");) {
            System.out.println("Qual o valor do seu salário atualmente?");
           // salar = leitor.nextDouble();

            System.out.println("Quantos filhos você tem? ");
            //filho = leitor.nextLine();





            System.out.println("Deseja finalizar pesquisa? (s/n): ");
            finalizar = leitor.next();
            leitor.close();
        }
        leitor.close();
    }
}
