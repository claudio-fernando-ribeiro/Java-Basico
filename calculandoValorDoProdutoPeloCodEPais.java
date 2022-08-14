import java.util.Scanner;

public class CalculandoValorDoProdutoPeloCodEPais {
    public static void main(String[] args) {
        int codigoProduto= 0;
        int codigoPais = 0;
        float peso = 0;
        float preco = 0;
        float imposto2 = 15, imposto3 = 25;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o código do produto");
        codigoProduto = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o peso do produto");
        peso = Float.parseFloat(leitor.nextLine());

        if (codigoProduto <=4) { 
            preco = (peso * 100)*10;
            System.out.println("O preço sem imposto é R$" + preco);
            System.out.println("Digite o código do país do produto");
            codigoPais = Integer.parseInt(leitor.nextLine());
            } if (codigoPais == 1) {
            System.out.println("O preço do produto é R$" + preco);
            } else if (codigoPais == 2) {
                imposto2 = (preco*15) /100;
                System.out.println("O preço do produto com 15% de imposto é R$"+ (preco + imposto2));
            } else if (codigoPais == 3) {
                imposto3 = (preco*25) /100;
                System.out.println("O preço do produto com 25% de imposto é R$"+ (preco + imposto3));
            }
            else if (codigoProduto  >4 && codigoProduto <=7) { 
                preco = (peso * 100)*25;
                System.out.println("O preço é sem imposto é R$" + preco);
                System.out.println("Digite o código do país do produto");
                codigoPais = Integer.parseInt(leitor.nextLine());
                } if (codigoPais == 1) {
                System.out.println("O preço do produto é R$" + preco);
                } else if (codigoPais == 2) {
                    imposto2 = (preco*15) /100;
                    System.out.println("O preço do produto com 15% de imposto é R$"+ (preco + imposto2));
                } else if (codigoPais == 3) {
                    imposto3 = (preco*25) /100;
                    System.out.println("O preço do produto com 25% de imposto é R$"+ (preco + imposto3));
                }
                else if (codigoProduto  >7 && codigoProduto <=10) { 
                    preco = (peso * 100)*35;
                    System.out.println("O preço é sem imposto é R$" + preco);
                    System.out.println("Digite o código do país do produto");
                    codigoPais = Integer.parseInt(leitor.nextLine());
                    } if (codigoPais == 1) {
                    System.out.println("O preço do produto é R$" + preco);
                    } else if (codigoPais == 2) {
                        imposto2 = (preco*15) /100;
                        System.out.println("O preço do produto com 15% de imposto é R$"+ (preco + imposto2));
                    } else if (codigoPais == 3) {
                        imposto3 = (preco*25) /100;
                        System.out.println("O preço do produto com 25% de imposto é R$"+ (preco + imposto3));
                    } else {
                        System.out.println("A algo errado, reinicie o programa e digite os valores corretamente");
                    }
    }
}
