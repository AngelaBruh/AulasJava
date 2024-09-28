/*
 * Crie um programa em Java que imprima apenas os múltiplos de 3 e 7, até 100 vezes.
 */

 public class Exe4Aula8 { 
    public static void main(String[] args) {
        int tabu3, tabu7;
        System.out.println("Multiplos 3 até 100 vezes:");
        for(int i = 0; i<=100 ;i++){
            tabu3 = 3 * i;
            System.out.println(tabu3);
        }
        System.out.println("Multiplos 7 até 100 vezes:");
        for(int i = 0; i<=100 ;i++){
            tabu7 = 7 * i;
            System.out.println(tabu7);
        }
              
        
    }
 }