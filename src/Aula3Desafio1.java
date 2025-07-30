import java.util.Scanner;

public class Aula3Desafio1 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número positivo ou negativo");
        numero = leitura.nextInt();
        if (numero >=0) {
            System.out.println("Seu número é positivo");
        }  else {
            System.out.println("Seu número é negativo");
        }



    }
}
