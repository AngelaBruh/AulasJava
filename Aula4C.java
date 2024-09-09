public class Aula4C {
    public static void main(String[] args) {
        int numeroNaoQuebrado = 10;
        //float numeroQuebrado = 7f/3f;
        double numeroQuebrado = 7.0/3.0; //Divisão
        System.out.printf("%2f\n", numeroQuebrado);
        char letra;
        String texto;
        boolean teste;
        //Calculos
        //Soma
        var resultado = numeroNaoQuebrado + numeroQuebrado;
        System.out.printf("%2f\n", resultado);
        //Subtração
        resultado = numeroNaoQuebrado - numeroQuebrado;
        System.out.printf("%2f\n", resultado);
        //Multiplicação
        resultado = numeroNaoQuebrado * numeroQuebrado;
        System.out.printf("%2f\n", resultado);   
        letra = 'A'; //representa uma unidade de caracter, mas é possivel limitar a quantidade.
        texto = "ABC - ABCdario";
        System.out.println(texto.charAt(4));
        System.out.println(texto+texto+texto);
        teste = letra == 'A'; // == comparação
        System.out.println(teste);
        teste = resultado > 1;
        System.out.println(teste);
        teste = resultado < 10;
        System.out.println(teste);
        teste = resultado >= 5;
        System.out.println(teste);




        

    }
}
