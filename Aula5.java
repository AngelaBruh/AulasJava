


import java.util.Scanner;
import java.util.Random;
public class Aula5 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner leitura = new Scanner (System.in);
        final int sorteio = aleatorio.nextInt(1,6);
        System.out.println("Digite um numero:");
        int numero = leitura.nextInt();
        if(numero == sorteio){
        System.out.println("Acertou!");
        leitura.close();
        return;
        }
        System.out.println("Digite um numero:");
        numero = leitura.nextInt();
        if(numero == sorteio){
        System.out.println("Acertou!");
        leitura.close();
        return;
        }
    }
}
