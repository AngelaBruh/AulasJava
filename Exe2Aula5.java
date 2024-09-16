/*
 * Calcule a soma das médias dos 5 estudantes e, ao final, informe se cada estudante foi 
 * aprovado ou reprovado (considere que a média de aprovação deve ser maior ou igual a 6).
 * 
 */

    import java.util.Scanner;
public class Exe2Aula5 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[] notas = new double[5];
        String[] nomes = new String[5];
        double[] media = new double[5];
        double soma;

        for(int i = 0; i < 5; i++){
            soma = 0; //reiniciar soma de cada aluno
        System.out.println("Informe o nome do aluno(a): ");
        nomes[i] = leitor.nextLine();

            System.out.println("Informe as notas do aluno(a) " + nomes[i] + ":");
            for(int n = 0; n < 5; n++){            
                notas[i] = leitor.nextDouble();
                soma += notas[i];                  
            }
            leitor.nextLine();
            
            media[i] = soma/5;        
            if (media[i] >= 6.0) {
                System.out.println("Aluno(a) " + nomes[i] + ": aprovado.");
            } else {
                System.out.println("Aluno(a) " + nomes[i] + ": reprovado.");                  
            }
        }       
        leitor.close();
    }
}
