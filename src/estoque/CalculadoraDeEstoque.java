package estoque;

public class CalculadoraDeEstoque {
    public static void main(String[] args) {
//        double livroJava8;
//        double livroTDD;
//
//        livroJava8 = 48.0;
//        livroTDD = 57.0;

        double livroJava8 = 48.0;
        double livroTDD = 57.0;

        double soma = livroTDD + livroJava8;
        System.out.println("O total em estoque é: \n" + soma);

        // casting
        int numeroInteiro = (int) livroJava8;
        System.out.println("Casting to int: \n" + numeroInteiro );

        System.out.println("Total em estoque: \n" + soma);

        if(soma < 150){
            System.out.println("Estoque muito baixo!\n");
        }else if(soma >= 2000){
            System.out.println("Seu estoque está muito alto! \n ");
        }else{
            System.out.println("Estoque está bom!\n");
        }

        boolean result = soma < 150;

        if(result){
            System.out.println("Estoque menor que 150");
        }

    }
}
