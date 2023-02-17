import java.util.Scanner;

public class CalculaH {

    public static void main(String[] args) {
        int n;
        double h;

        n = readN();
        h = calculaH(n);

        System.out.println("O valor de h é aproximadamente " + String.format("%.0f", h));
    }

    public static int readN(){
        Scanner in = new Scanner(System.in);

        int n = 0;

        System.out.println("Digite o número N de termos: ");
        n = in.nextInt();

        while (n < 1){
            System.out.println("Digite um número N válido(maior ou igual a 1): ");
            n = in.nextInt();
        }

        return n;
    }

    public static double calculaH(int n){
        double h = 0;

        for (int i = 1; i <= n; i++){
            h +=  (double) 1 / i;
        }
        return h;
    }

}
