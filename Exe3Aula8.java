/*
 * Crie um sistema em Java para a leitura dos 30 usuários na empresa Davi's Model.
 * 
*/

import java.util.Scanner;
public class Exe3Aula8{
      public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        String[]usuario = new String[30];


        for(int u = 0; u < 30; u++){
            System.out.println("Informe o nome do usuario: ");
            usuario[u] = leitor.nextLine();
        }       

        System.out.println("Listagem de nomes informados: ");
        for(String user : usuario){ //Printa uma variavel que fez amarzenamento de outro for
        System.out.println(user);
        }
              
        leitor.close();
    }
}