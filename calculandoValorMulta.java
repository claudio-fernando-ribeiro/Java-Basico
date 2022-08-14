import java.util.Scanner;

public class calculandoValorMulta {
    public static void main(String[] args) {
        
float salario = 0;
float conta1 = 0;
float valorMulta1 = 0;
float valorMulta2 = 0;
float conta2 = 0;
float valorRestante = 0;
Scanner leitor = new Scanner(System.in);

System.out.println("Digite o valor do salário do Darlon");
salario = Float.parseFloat(leitor.nextLine());

System.out.println("Digite o valor da conta 1");
conta1 = Float.parseFloat(leitor.nextLine());

System.out.println("Digite o valor da conta 2");
conta2 = Float.parseFloat(leitor.nextLine());

valorMulta1 = (conta1*2f) /100;
valorMulta2 = (conta2*2f) /100;

valorRestante = (salario - ((conta1 + valorMulta1) + (conta2 + valorMulta2)));

System.out.println("O valor restante é R$ " + valorRestante);

    }
}
