import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        System.out.print("Digite um número inteiro (quantas vezes repetir): ");
        int vezes = scanner.nextInt();

        int contador = 0;
        while (contador < vezes) {
            System.out.println(frase);
            contador++;
        }

        scanner.close();
    }
}
