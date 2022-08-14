import java.util.Scanner;

public class CalculandoCustoCarro {
    public static void main(String[] args) {
       
            float precoFabrica = 0;
            float percLucroDistribuidor = 0;
            float lucroDistribuidor = 0;
            float impostos = 0;
            float valorImpostos = 0;
            Scanner leitor = new Scanner(System.in);

            System.out.println("Digite o valor do carro de fábrica");
            precoFabrica = Float.parseFloat(leitor.nextLine());
            System.out.println("Digite o percentual de lucro do distribuidor");
            percLucroDistribuidor = Float.parseFloat(leitor.nextLine());
            System.out.println("Digite o percentual de impostos");
            impostos = Float.parseFloat(leitor.nextLine());

            lucroDistribuidor = ((precoFabrica*percLucroDistribuidor) / 100);
            valorImpostos = ((precoFabrica*impostos) / 100);
            System.out.println("O valor de lucro do distribuidor é de R$" + lucroDistribuidor);
            System.out.println("O valor dos impostos são de R$" + valorImpostos);
            System.out.println("O preço final do carro é de R$" + (precoFabrica + lucroDistribuidor + valorImpostos));

        }
    }

