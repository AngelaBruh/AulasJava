


import java.util.Scanner;
import java.util.Random;

public class Aula5 {
   
    public static void main(String[] args) {
        //Atribuindo valores iniciais
        Random aleatorio = new Random();
        Scanner leitura = new Scanner (System.in);
        final int sorteio = aleatorio.nextInt(1,6);

        //Obtendo valores com o usuario
        System.out.println("Digite um numero:");
        int numero = leitura.nextInt(), pontuacao = 30;

        //Testes de pontuação
        if (numero == sorteio) {
            System.out.println("Você acertou com " + pontuacao + " pontos");
            leitura.close();
            return;
        } else {
            pontuacao = pontuacao - 10;
            System.out.println("Você perdeu " + 10 + " pontos e está com " + pontuacao + " pontos"); //Aqui não necessita de return pois é a saida
            if (pontuacao == sorteio) {
                System.out.println("Você acertou com " + pontuacao + "pontos");
                leitura.close();
                return;
            } else {
                pontuacao = pontuacao - 10;
                System.out.println("Você perdeu " + 10 + " pontos e está com " + pontuacao + " pontos"); 
            }
            if (pontuacao == sorteio) {
                System.out.println("Você acertou com " + pontuacao + " pontos");
                leitura.close();
                return;
            } else {
                pontuacao = pontuacao - 10;
                System.out.println("Game Over - Você está fora do jogo"); 
            }
        }       

       
         /*/Usuario perdeu 10 pontos, possuindo 20
         if (pontuacao == sorteio) {
            System.out.println("Você acertou com " + pontuacao + "pontos");
            leitura.close();
            return;
        } else {
            pontuacao = pontuacao - 10;
            System.out.println("Você perdeu " + 10 + " pontos e está com " + pontuacao + " pontos"); 
        }*/


         /*/Usuario perdeu 20 pontos, possuindo 10
         if (pontuacao == sorteio) {
            System.out.println("Você acertou com " + pontuacao + " pontos");
            leitura.close();
            return;
        } else {
            pontuacao = pontuacao - 10;
            System.out.println("Game Over - Você está fora do jogo"); 
        }*/

        
        leitura.close();
    }
}
