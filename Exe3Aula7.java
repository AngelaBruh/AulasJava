
/*
 * Crie um sistema que leia a temperatura e faça a conversão para:
 * Fahrenheit para Celsius
 * Celsius para Fahrenheit
 * 
 */

 import java.util.Scanner;
public class Exe3Aula7 {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite uma temperatura: ");
    int temp = leitor.nextInt();

    System.out.println("Realizando a conversão de Fahrenheit para Celsius: ");

            int f = (temp * (9/5)) + 32;
            System.out.println(f);

    System.out.println("Realizando a conversão de Celsius para Fahrenheit: ");

            int c = (f - 32) * (9/5);
            System.out.println(c);



    leitor.close();
    }
}
