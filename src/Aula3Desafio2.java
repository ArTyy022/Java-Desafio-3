import java.util.Scanner;

public class Aula3Desafio2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira dois números inteiros" );
        int numero1 = leitura.nextInt();
        int numero2 = leitura.nextInt();
        if (numero1 > numero2) {
            System.out.println("O número " + numero1 + " É maior que o " + numero2);
        } else {

            System.out.println("O número " + numero2 +  " É maior que o " + numero1);
        }
    }
}
