import java.util.Scanner;

public class CalculaPrecoCarro {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double precoFinal;

        precoFinal = calculaPreco(readCustoFabrica(), readPorcentagemDistribuidor(), readPorcentagemImpostos());

        System.out.println("O preço final do carro é: " + precoFinal);

    }

    public static double readCustoFabrica(){
        double custoFabrica;

        System.out.println("Digite o custo de fábrica do carro: ");
        custoFabrica = in.nextDouble();

        while (custoFabrica < 0){
            System.out.println("Digite um custo de fábrica válido: ");
            custoFabrica = in.nextDouble();
        }

        return custoFabrica;
    }

    public static double readPorcentagemDistribuidor(){
        double porcentagemDistribuidor;

        System.out.println("Digite a porcentagem do distribuidor: ");
        porcentagemDistribuidor = in.nextDouble();

        while (porcentagemDistribuidor < 0 || porcentagemDistribuidor > 100){
            System.out.println("Digite uma porcentagem do distribuidor válida(entre 0% e 100%): ");
            porcentagemDistribuidor = in.nextDouble();
        }

        return porcentagemDistribuidor;
    }

    public static double readPorcentagemImpostos(){
        double porcentagemImpostos;

        System.out.println("Digite a porcentagem dos impostos");
        porcentagemImpostos = in.nextDouble();

        while (porcentagemImpostos < 0 || porcentagemImpostos > 100){
            System.out.println("Digite uma porcentagem dos impostos válida(entre 0% e 100%) : ");
            porcentagemImpostos = in.nextDouble();
        }

        return porcentagemImpostos;
    }

    public static double calculaPreco(double custoFabrica, double porcentagemDistribuidor, double porcentagemImpostos){
        double precoPorcentagemDistribuidor, precoPorcentagemImpostos , precoFinal;

        precoPorcentagemDistribuidor = custoFabrica * (porcentagemDistribuidor / 100);
        precoPorcentagemImpostos = custoFabrica * (porcentagemImpostos / 100);
        precoFinal = custoFabrica + precoPorcentagemDistribuidor + precoPorcentagemImpostos;

        return precoFinal;
    }


}
