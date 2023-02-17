import java.util.Scanner;

public class SequenciaFibonacci {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, proximo, anterior = 0, atual = 1;

        n = in.nextInt();

        for (int i = 1; i <= n; i++){
            if (i == n){
                System.out.print(anterior);
            } else {
                System.out.print(anterior + " ");

                proximo = anterior + atual;
                anterior = atual;
                atual = proximo;

            }




        }


    }
}
