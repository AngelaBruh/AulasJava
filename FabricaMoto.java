import java.time.LocalDateTime;
import java.util.Scanner;
public class FabricaMoto {
    public String marca;
    public String cor;
    public LocalDateTime ano;
    public String nome;
    public FabricaMoto(){
        Scanner leitura = new Scanner(System.in);
        this.nome = leitura.nextLine();
    }
}

