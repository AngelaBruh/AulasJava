


import java.util.Scanner;
public class Pessoa {
    public String nome;
    public String sobrenome;
    public int idade;
    public String sexo;
    

        public void idade(){
            System.out.println(nome + " " + sobrenome + " possui " + idade + " anos");
        }
    
    public Pessoa(){
        Scanner leitor = new Scanner (System.in);
        System.out.println("Digte seu nome: ");
        this.nome = leitor.nextLine();
        System.out.println("Digte seu sobrenome: ");
        this.sobrenome = leitor.nextLine();
        System.out.println("Informe o sexo -- (M para masculino / F para feminino): ");
        this.sexo = leitor.nextLine();

        while(true){
            try{
                Scanner id = new Scanner(System.in);
                System.out.println("Informe sua idade: ");
                this.idade = id.nextInt();
                break;
            }
            catch(Exception e){
                System.out.println("Informe um valor valido: ");
            }
        }
        leitor.close();

    }
}
