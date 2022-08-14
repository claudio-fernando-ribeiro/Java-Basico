import java.util.Scanner;

public class calculoQuantidadeSalário {
    public static void main(String[] args) {
        
        float valorSalMin = 0;
        float valorSalFunc = 0;
        float qtdeSalarios = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do salário mínimo:");
        valorSalMin = Float.parseFloat(leitor.nextLine());

        System.out.println("Digite o valor do salário do funcionário:");
        valorSalFunc = Float.parseFloat(leitor.nextLine());

        qtdeSalarios = valorSalFunc / valorSalMin;

        System.out.println("O funcionário recebe " + qtdeSalarios + " salários mínimos");

    }
}
