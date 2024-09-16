/* 
 * Crie um sistema que leia a temperatura em graus Celsius e determine se ela é quente ou fria.
 */



import java.util.Scanner;
public class Exe3Aula5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma temperatura: ");
        int temp = leitor.nextInt();

        if (temp >= 30) {
            System.out.println("Tá calor, beba agua.");
        } else {
            System.out.println("Tá frio, vá se aquecer.");
        }
        leitor.close();
    }
}
