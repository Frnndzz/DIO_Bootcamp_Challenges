import java.util.Scanner;

public class NivelEnergia {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int casos, poderDeLuta;

        System.out.println("Digite o número de casos: ");
        casos = in.nextInt();

        while (casos < 1){
            System.out.println("Digite o número de casos válido(maior que 1): ");
            casos = in.nextInt();
        }

        for (int i = 0; i < casos; i++){
            System.out.println("Digite o poder de luta: ");
            poderDeLuta = in.nextInt();

            while (poderDeLuta < 100 || poderDeLuta > 100000){
                System.out.println("Digite um poder de luta válido(entre 100 e 100000): ");
                poderDeLuta = in.nextInt();
            }

            if (poderDeLuta <= 8000){
                System.out.println("Inseto!");
            } else {
                System.out.println("Mais de 8000!");
            }
        }



    }

}
