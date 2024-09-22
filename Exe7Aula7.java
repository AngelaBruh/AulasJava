/*
 * Crie um sistema que leia o dia da semana (1-7) e informe o dia correspondente
 */

import java.util.Scanner;
public class Exe7Aula7 {
    public static void main(String[] args) {
        String[] dia = {
            "Hoje é Domingo",
            "Hoje é Segunda-feira",
            "Hoje é Terça-feira",
            "Hoje é Quarta-feira",
            "Hoje é Quinta-feira",
            "Hoje é Sexta-feira",
            "Hoje é Sabado",
        };
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um numero de 1 a 7: ");
        switch (leitor.nextLine()) {
            case "1":
                System.out.println(dia[0]);
                break;
            case "2":
            System.out.println(dia[1]);
            break;
            case "3":
            System.out.println(dia[2]);
            break;
            case "4":
            System.out.println(dia[3]);
            break;
            case "5":
            System.out.println(dia[4]);
            break;
            case "6":
            System.out.println(dia[5]);
            break;
            case "7":
            System.out.println(dia[6]);
            break;           
            default:
                System.out.println("Digite somente numeros de 1 ao 7.");
                break;
        }
        leitor.close();
    }
}
