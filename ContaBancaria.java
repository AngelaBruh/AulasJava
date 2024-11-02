

import java.util.Scanner;
public class ContaBancaria{
        public int numeroConta;
        public String titular;
        public double saldo;

        public ContaBancaria(){
            Scanner leitor = new Scanner(System.in);
            System.out.println("Informe o titular da conta: ");
            this.titular = leitor.nextLine();
            System.out.println("O que deseja realizar?");


            leitor.close();
        }

}