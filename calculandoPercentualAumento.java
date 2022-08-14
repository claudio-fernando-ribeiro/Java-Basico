import java.util.Scanner;

public class CalculandoPercentualAumento {
    public static void main(String[] args) {
        
        Float salario = 0f;
        Float percAumento = 0f;
        Float valorAumento = 0f;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor o do salário");
        salario = Float.parseFloat(leitor.nextLine());

        System.out.println("Digite a porcentagem de aumento");
        percAumento = Float.parseFloat(leitor.nextLine());

        valorAumento = (salario*percAumento) / 100;

        System.out.println("O valor do aumento é de R$" + valorAumento);
        System.out.println("O valor do novo salário é de R$" + (salario+valorAumento));

    }
}
