
/*
 * java Aula10.java -- quando apresentar erro na compilação do codigo devido ao codespace, acesse o terminal e compile na unha.
 * 
 */



import java.time.LocalDateTime;
import java.util.Scanner;
public class FabricaCarro {
        public String marca;
        public String cor;
        public LocalDateTime ano;
        public String nome;
        public FabricaCarro(){
            Scanner leitura = new Scanner(System.in);
            this.nome = leitura.nextLine();
        }
}



public class Aula10 {
    public static void main(String[] args) {
        FabricaCarro carro = new FabricaCarro();
        System.out.println(carro.nome);

    }
}