/*
 * Implemente um programa que some valores inseridos pelo usuário até que ele digite 0, parando de rodar o programa.
 */
import java.util.Scanner;
public class Exe9Aula7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int soma = 0;
        int valor = -1; // Inicializa com um valor diferente de 0

        System.out.println("Digite 0 para interromper a operação.");
        while (valor != 0) {
            System.out.print("Digite um valor: ");
            valor = leitor.nextInt();
            soma += valor;
        }

        System.out.println("A soma dos valores é: " + soma);
        leitor.close();
    }
}
