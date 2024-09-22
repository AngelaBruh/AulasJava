/*
 * Desenvolva um programa em Java para classificar times de futebol pelos 
 * estados do Brasil. Exemplo: Time do São Paulo → Estado de São Paulo
 */

 import java.util.Scanner;
public class Exe6Aula7 {
    public static void main(String[] args) {
        String[] times = {     
            "Time - Acreano",
            "Time - CSA",
            "Time - Ypiranga",
            "Time - Nacional",
            "Time - Vitória",
            "Time - Fortaleza",
            "Time - Gama",
            "Time - Rio Branco",
            "Time - Vila Nova",
            "Time - Moto Club",
            "Time - Luverdense",
            "Time - Operário",
            "Time - Remo",
            "Time - Botafogo-PB",
            "Time - Atlético Paranaense",
            "Time - Sport",
            "Time - River Plate",
            "Time - Fluminense",
            "Time - América-RN",
            "Time - Grêmio",
            "Time - Genus",
            "Time - Baré",
            "Time - Avaí",
            "Time - Corinthians",
            "Time -  Confiança",
            "Time - Tocantinópolis", 
            "Time - Cruzeiro", 
        };
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um nome de um estado brasileiro: ");
        switch (leitor.nextLine()) {
            case "Acre":
                System.out.println(times[0]);
                break;
            case "Alagoas":
            System.out.println(times[1]);
            break;
            case "Amapa":
            System.out.println(times[2]);
            break;
            case "Amazonas":
            System.out.println(times[3]);
            break;
            case "Bahia":
            System.out.println(times[4]);
            break;
            case "Ceara":
            System.out.println(times[5]);
            break;
            case "Distrito Federal":
            System.out.println(times[6]);
            break;
            case "Espirito Santo":
            System.out.println(times[7]);
            break;
            case "Goias":
            System.out.println(times[8]);
            break;
            case "Maranhão":
            System.out.println(times[9]);
            break;
            case "Mato Grosso":
            System.out.println(times[10]);
            break;
            case "Mato Grosso do Sul":
            System.out.println(times[11]);
            break;
            case "Minas Gerais":
            System.out.println(times[26]);
            break;
            case "Para":
            System.out.println(times[13]);
            break;
            case "Paraiba":
            System.out.println(times[14]);
            break;
            case "Pernambuco":
            System.out.println(times[15]);
            break;
            case "Piaui":
            System.out.println(times[16]);
            break;
            case "Rio De Janeiro":
            System.out.println(times[17]);
            break;
            case "Rio Grande do Norte":
            System.out.println(times[18]);
            break;
            case "Rio Grande do Sul":
            System.out.println(times[19]);
            break;
            case "Rondonia":
            System.out.println(times[20]);
            break;
            case "Roraima":
            System.out.println(times[21]);
            break;
            case "Santa Catarina":
            System.out.println(times[22]);
            break;
            case "São Paulo":
            System.out.println(times[23]);
            break;
            case "Sergipe":
            System.out.println(times[24]);
            break;
            case "Tocantins":
            System.out.println(times[25]);
            break;
            default:
                    System.out.println("Digite um estado brasileiro valido.");
                break;
        }

        leitor.close();
    }
}
