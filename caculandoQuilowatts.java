import java.util.Scanner;

public class CaculandoQuilowatts {
    public static void main(String[] args) {
        float salariomin = 0;
        float valorDoQuilowatt = 0;
        float qtdeDeQuilowatt = 0;
        float valorASerPago = 0;
        float valorDesc = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do salário mínimo.");
        salariomin = Float.parseFloat(leitor.next());

        System.out.println("Qual a quantidade de quilowatts consumida?");
        qtdeDeQuilowatt = Float.parseFloat(leitor.next());

        valorDoQuilowatt = salariomin/5;
        valorASerPago = (qtdeDeQuilowatt * valorDoQuilowatt);
        valorDesc = (valorASerPago*15) / 100;

        System.out.println("Cada quilowatt custa R$ " + valorDoQuilowatt);
        System.out.println("O valor (sem desconto) é de R$" + valorASerPago);
        System.out.println("O valor com desconto é de R$" + (valorASerPago - valorDesc));
    }
}
