/*
 * Crie um programa em Java que, ao receber um estado do usuário como entrada, exiba uma ou mais
 * cidades pertecentes ao estado selecionado.
 */




import java.util.Scanner;
public class Exe1Aula6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[] cidades = {
            "Itapevi",
            "Sobral",
            "Olinda",
            "Pelotas",
            "Maringá",
            "Ilhéus",
            "Niterói",
            "Manaus",
            "Santarém",
            "Uberlândia"};

        System.out.println("Informe seu estado: ");
        switch (leitor.nextLine()) {
            case "São Paulo" :
                System.out.println(cidades[0]);
                break;
            case"Amazonas":
                System.out.println(cidades[7]);
                break;
            case"Rio Grande Do Sul":
                System.out.println("Cidade: " + cidades[3]);
                break;
            case"Pernambuco":
                System.out.println("Cidade: " + cidades[2]);
                break;
            case"Ceara":
                System.out.println("Cidade: " + cidades[1]);
                break;
            case"Pará":
                System.out.println("Cidade: " + cidades[8]);
                break;
            case"Minas Gerais":
                System.out.println("Cidade: " + cidades[9]);
                break;
            case"Bahia":
                System.out.println("Cidade: " + cidades[5]);
                break;
            case"Parana":
                System.out.println("Cidade: " + cidades[4]);
                break;
            case"Rio De Janeiro":
                System.out.println("Cidade: " + cidades[6]);
                break;              
            default:
                System.out.println("Digite um estado valido.");
                break;
        }
        leitor.close();
    }
}
