
//Calcule a média das duas notas de um estudante.

import java.util.Scanner;
public class Exe2Aula7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nomeAluno;
        int nota1, nota2;

        System.out.println("Informe o nome do aluno(a): ");
        nomeAluno = leitor.nextLine();
        System.out.println("Informe as duas nota do aluno(a) " + nomeAluno);

        System.out.println("Digite a primeira nota:");
        nota1 = leitor.nextInt();
        System.out.println("Digite a segunda nota:");
        nota2 = leitor.nextInt();

        double media = (nota1+nota2)/2;

        System.out.println("Media do aluno(a) " + nomeAluno + " foi: " + media);   






    leitor.close();
    }

}
