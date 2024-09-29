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

        boolean repetidoEncontrado = false;
        for (int i = 0; i < 50; i++) { //aqui estou clonando a lista,aqui é a primeira lista
            for (int j = i + 1; j < 50; j++) { // aqui é a segunda lista
                if (VET[i] == VET[j]) { // aqui vou estar comparando a lista
                    repetidoEncontrado = true;
                    System.out.println("Número repetido " + VET[i] + " encontrado nas posições " + i + " e " + j);
                }
            }
        }
        if (!repetidoEncontrado) {
            System.out.println("Nenhum número repetido encontrado.");
        }
        

        leitor.close();
    }
 }