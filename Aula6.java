/*
 * 
 */
    import java.util.Scanner;
    import java.util.Random;
 public class Aula6{

            public static void main(String[] args) {
                Random aleatorio = new Random();
                Scanner leitura = new Scanner(System.in);
                final int sorteio = aleatorio.nextInt(1,6);
                System.out.println("Digite um numero: ");
                int numero = leitura.nextInt();
                if(sorteio < numero){
                    System.out.println("Numero digitado é maior que o numero selecionado.");
                }else if(sorteio > numero){
                    System.out.println("Numero digitado é menor que o numero selecionado.");
                }else{
                    System.out.println("Você acertou com 30 pontos");
                    return; //finaliza o programa
                }
                leitura.close();
            }

 }