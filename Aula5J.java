import java.util.Random;
import java.util.Scanner;

public class Aula5J {
    public static void main(String[] args) {
        //Atribuindo valores iniciais
        Random aleatorio = new Random();
        Scanner leitura = new Scanner(System.in);
        final int sorteio = aleatorio.nextInt(1,6);
        int numero, pontuacao = 30;
       
        //Obtendo valores do usuario
        System.out.println("Digite um numero: ");
        numero = leitura.nextInt();

        //Teste de pontuacao
        System.out.println("Bem-vindo(a) ao sorteio você tem três chances começando com 30 pontos.");
        if(numero == sorteio){
            System.out.println("Você acertou " + pontuacao + " pontos");
        }else{
            pontuacao -= 10;
            System.out.println("Você perdeu 10 pontos e está com " + pontuacao + " pontos");
            System.out.println("Digite um número:");
            numero = leitura.nextInt();        

                if (numero == sorteio) {
                    System.out.println("Você acertou com " + pontuacao + " pontos");
                } else {
                    pontuacao -= 10;
                    System.out.println("Você perdeu 10 pontos e está com " + pontuacao + " pontos");
                    System.out.println("Digite um número:");
                    numero = leitura.nextInt(); 

                        if(numero == sorteio){
                        System.out.println("Você acertou com " + pontuacao + " pontos");
                        }else{
                            System.out.println("Você perdeu e não possui mais chances!");
                        }
                }
            
        }    
        leitura.close();



    }
}