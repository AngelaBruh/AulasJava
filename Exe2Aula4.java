/*
 * 2.Calcule a soma das médias dos 5 estudantes e, ao final, retorne essa soma e os nomes dos estudantes.
 */

   import java.util.Scanner;   
   public class Exe2Aula4 {
 
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
      leitura.nextLine();

      System.out.println("\nInforme o nome do aluno: ");
      String nomeAluno2 = leitura.nextLine();
      System.out.println("Informe a primeira nota: ");
      double nota12 = leitura.nextDouble();
      System.out.println("Informe a segunda nota: ");
      double nota22 = leitura.nextDouble();
      System.out.println("Informe a terceira nota: ");
      double nota32 = leitura.nextDouble();
      System.out.println("Informe a quarta nota: ");
      double nota42 = leitura.nextDouble();
      System.out.println("Informe a quinta nota: ");
      double nota52 = leitura.nextDouble();      
      double media2 = ((nota12 + nota22 + nota32 + nota42 + nota52) / 5);
      System.out.println("Media final do aluno(a) " + nomeAluno2 + ": " + media2);
      leitura.nextLine();

      System.out.println("\nInforme o nome do aluno: ");
      String nomeAluno3 = leitura.nextLine();
      System.out.println("Informe a primeira nota: ");
      double nota13 = leitura.nextDouble();
      System.out.println("Informe a segunda nota: ");
      double nota23 = leitura.nextDouble();
      System.out.println("Informe a terceira nota: ");
      double nota33 = leitura.nextDouble();
      System.out.println("Informe a quarta nota: ");
      double nota43 = leitura.nextDouble();
      System.out.println("Informe a quinta nota: ");
      double nota53 = leitura.nextDouble();      
      double media3 = ((nota13 + nota23 + nota33 + nota43 + nota53) / 5);
      System.out.println("Media final do aluno(a) " + nomeAluno3 + ": " + media3);
      leitura.nextLine();

      System.out.println("\nInforme o nome do aluno: ");
      String nomeAluno4 = leitura.nextLine();
      System.out.println("Informe a primeira nota: ");
      double nota14 = leitura.nextDouble();
      System.out.println("Informe a segunda nota: ");
      double nota24 = leitura.nextDouble();
      System.out.println("Informe a terceira nota: ");
      double nota34 = leitura.nextDouble();
      System.out.println("Informe a quarta nota: ");
      double nota44 = leitura.nextDouble();
      System.out.println("Informe a quinta nota: ");
      double nota54 = leitura.nextDouble();      
      double media4 = ((nota14 + nota24 + nota34 + nota44 + nota54) / 5);
      System.out.println("Media final do aluno(a) " + nomeAluno4 + ": " + media4);
      leitura.nextLine();

      System.out.println("\nInforme o nome do aluno: ");
      String nomeAluno5 = leitura.nextLine();
      System.out.println("Informe a primeira nota: ");
      double nota15 = leitura.nextDouble();
      System.out.println("Informe a segunda nota: ");
      double nota25 = leitura.nextDouble();
      System.out.println("Informe a terceira nota: ");
      double nota35 = leitura.nextDouble();
      System.out.println("Informe a quarta nota: ");
      double nota45 = leitura.nextDouble();
      System.out.println("Informe a quinta nota: ");
      double nota55 = leitura.nextDouble();      
      double media5 = ((nota15 + nota25 + nota35 + nota45 + nota55) / 5);
      System.out.println("Media final do aluno(a) " + nomeAluno5 + ": " + media5);   

      leitura.close();


    }
 }
