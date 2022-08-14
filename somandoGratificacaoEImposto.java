import java.util.Scanner;

public class SomandoGratificacaoEImposto {
    public static void main(String[] args) {
        float salariobase = 0;
        float gratificacao = 0;
        float imposto = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do salário");
        salariobase = Float.parseFloat(leitor.nextLine());
        gratificacao = (salariobase*5) / 100;
        System.out.println("O salário somado a gratificação é de R$" + (gratificacao + salariobase));
        imposto = ((salariobase*7)/100);
        System.out.println("O valor do imposto é R$" + imposto);
        System.out.println("O salário a receber é de R$" + ((gratificacao + salariobase) -imposto));
        

    }
}
