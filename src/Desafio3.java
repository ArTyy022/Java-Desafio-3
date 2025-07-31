import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutos;

        System.out.print("Digite um valor em minutos (0 para sair): ");
        minutos = scanner.nextInt();

        while (minutos != 0) {
            int horas = minutos / 60;
            int minutosRestantes = minutos % 60;

            System.out.println(minutos + " minutos = " + horas + " hora(s) e " + minutosRestantes + " minuto(s)");

            System.out.print("\nDigite outro valor em minutos (0 para sair): ");
            minutos = scanner.nextInt();
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}

