/*
 * 1.Crie um programa em Java que leia o nome do aluno e suas 5 notas, e ao final, retorne sua nota média.
 */


import java.util.Scanner;
public class Exe1Aula4 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe o nome do aluno: ");
        String nomeAluno = leitura.nextLine();
        System.out.println("Informe a primeira nota: ");
        double nota1 = leitura.nextDouble();
        System.out.println("Informe a segunda nota: ");
        double nota2 = leitura.nextDouble();
        System.out.println("Informe a terceira nota: ");
        double nota3 = leitura.nextDouble();
        System.out.println("Informe a quarta nota: ");
        double nota4 = leitura.nextDouble();
        System.out.println("Informe a quinta nota: ");
        double nota5 = leitura.nextDouble();
        
        double media = ((nota1 + nota2 + nota3 + nota4 + nota5) / 5);
        System.out.println("Media final do aluno(a) " + nomeAluno + ": " + media);
        leitura.close();
        
    }
}
