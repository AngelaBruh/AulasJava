import java.util.Scanner;

public class RegistroProdutos {
        public String[] nome = new String[10];
        public double[] preco = new double[10];
        public int[] qtd = new int[10];
        double[] mult = new double[10];

            public void cal(){
                System.out.println("\nProdutos adicionados:");
                for (String nomes : nome) {
                    System.out.println(nome);
                }

                double total = 0;                
                for (double mults : mult){            
                    total += mults;  // para somar variavel do for.
                    
                } 
                System.out.println("Valor total: " + total);                    
            }
            


        
        public RegistroProdutos(){
            Scanner leitor = new Scanner(System.in);
            for (int i = 0; i < 10; i++) {               
    
                while(true){
                        try{
                        System.out.println("Informe o nome do produto:");
                        nome[i] = leitor.nextLine();

                        System.out.println("Informe a quantidade de " + nome[i] + ":");
                        qtd[i] = leitor.nextInt();
            
                        System.out.println("Informe o valor de "+ nome[i] + ":");
                        preco[i] = leitor.nextDouble();          
                        leitor.nextLine();
                    }
                    catch(Exception e){
                        System.out.println("Digite um valor valido.");
                    }
                    mult[i] = qtd[i] * preco[i];     
                    leitor.nextLine();               
                }                 
            }
            leitor.close();               
            
        }
           
  }
