import java.util.Scanner;

public class Main {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int A, B, PROD;
        System.out.println("Digite o valor de A: ");
        A = teclado.nextInt();

        System.out.println("Digite o valor de B: ");
        B = teclado.nextInt();
        
        PROD = A + B;



        System.out.println("PROD = " + PROD);

        teclado.close();

    }
}
