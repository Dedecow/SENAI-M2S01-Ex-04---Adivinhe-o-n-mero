import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numeroAleatorio = (int) (Math.random()*(5-1+1)+1);
        Scanner sc = new Scanner(System.in);

        System.out.println( "Digite um número inteiro de 1 a 5");
        int numeroDigitado = sc.nextInt();
        String resultado = numeroDigitado == numeroAleatorio ? "Você acertou!" : "Você errou. O número correto era " + numeroAleatorio;

        System.out.println(resultado);
    }
}
