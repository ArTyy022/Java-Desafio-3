import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "sorvete123";
        String senhaDigitada;

        System.out.print("Digite a senha: ");
        senhaDigitada = scanner.nextLine();

        while (!senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Senha incorreta. Tente novamente.");
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextLine();
        }

        System.out.println("Senha correta! Acesso permitido.");
        scanner.close();
    }
}