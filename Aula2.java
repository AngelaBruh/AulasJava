import java.util.Scanner;
public class Aula2 { 
    public static void main (String[] args){
        Scanner leitorTxt = new Scanner(System.in);//in trás informação
        System.out.println("Digite seu nome:\n"); 
        String nome = leitorTxt.nextLine();
        System.out.println(nome);  
        leitorTxt.close(); //deve fechar para parar de alocar recursos, e ficar ocupando memoria.
    }
}