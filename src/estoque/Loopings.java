package estoque;

public class Loopings {

    public static void main(String[] args) {
        double soma = 0;
        int contador = 0;

        while (contador < 35) {
            double valorDoLivro = 58.0;
            soma += valorDoLivro;
            contador++;
            System.out.println(contador + "\n");
        }


        double soma2 = 33.2;
        for (int i = 0; i < 35; i++) {
            soma2 += 88.0;
        }
        System.out.println(soma2);
    }
}
