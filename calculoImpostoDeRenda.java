import java.util.Scanner;

public class CalculoImpostoDeRenda {
    public static void main(String[] args) {
        
        float salariobase = 0;
        float salarioliquido = 0;
        float gratificacao = 0;
        float imposto = 10;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do salário");
        salariobase = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o valor da gratificacao");
        gratificacao = Float.parseFloat(leitor.nextLine());
        salarioliquido = (salariobase*imposto) /100;
        System.out.println("O valor do imposto é de R$" + salarioliquido);
        salarioliquido = (salariobase - salarioliquido);
        System.out.println("O salário a receber é R$" + (salarioliquido+gratificacao));
    }
}
