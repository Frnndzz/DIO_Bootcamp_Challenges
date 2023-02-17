import java.util.Scanner;

public class PositivosAndMedia {

    static Scanner in = new Scanner(System.in);

    static final int N = 6;
    static int cont = 0;


    public static void main(String[] args) {
        double[] positivos;
        double media = 0;


        positivos = testaPositivos(readValores());
        media = calculaMedia(positivos);

        System.out.println(cont + " valores positivos");
        System.out.println("A média dos valores positivos é " + String.format("%.1f", media));

    }

    public static double[] readValores() {
        double[] valores = new double[N];

        for (int i = 0; i < N; i++){
            System.out.println("Digite o " + (i+1) + "° valor: ");
            valores[i] = in.nextDouble();
        }

        return valores;
    }

    public static double[] testaPositivos(double[] valores){
        double[] positivos = new double[N];

        for (int i = 0; i < N; i++){
            if (valores[i] > 0){
                positivos[cont] = valores[i];
                cont++;
            }
        }
        return positivos;
    }

    public static double calculaMedia(double[] positivos){
        double somaPositivos = 0, media = 0;

        for (int i = 0; i < cont; i++){
            somaPositivos += positivos[i];
        }
        media = somaPositivos / cont;

        return media;
    }

}
