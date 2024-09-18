
    import java.util.Scanner;
    import java.util.Random;
 public class Aula6{

            public static void main(String[] args) {
                Random aleatorio = new Random();
                Scanner leitura = new Scanner(System.in);
                final int sorteio = aleatorio.nextInt(1,6);
                int pontuacao = 30;
                System.out.println("Digite um numero: ");
                int numero = leitura.nextInt();
                if(sorteio <= numero){
                    //pontuacao = pontuacao - 10
                    pontuacao -= 10;
                    System.out.println("Numero digitado é maior que o numero sorteado e você está com " + pontuacao + "pontos");
                }else if(sorteio >= numero){
                    pontuacao -= 10;
                    System.out.println("Numero digitado é menor que o numero sorteado e você está com " + pontuacao + "pontos");
                }else{
                    System.out.println("Você acertou com 30 pontos");
                    leitura.close(); //finalizar o programa antes do return
                    return;
                }
                leitura.close(); //fecha novamente o programa               





            }


 }