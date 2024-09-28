/*
 * Faça um programa em Java para ler 50 números e armazenar em um vetor VET, 
 * verificar e escrever se existem números repetidos no vetor VET e em que posições se encontram.
 */

 import java.util.Scanner;
 public class Exe5Aula8 { 
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] VET = new int[50];

        System.out.println("Digite até 50 numeros aleatorios:");
        for(int i = 0; i < VET.length; i++){            
            VET[i] = leitor.nextInt();          
        }
        
        

        leitor.close();
    }
 }