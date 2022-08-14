import java.util.Scanner;

public class exerc24 {
    public static void main(String[] args) {

        float valorSalarioMin = 0;
        float valorDaHora = 0;
        float horasTrabalhadas = 0;
        float valorImposto = 0;
        float salarioBruto = 0;
        float salarioAReceber = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do salário mínimo");
        valorSalarioMin = Float.parseFloat(leitor.nextLine());
        valorDaHora = (valorSalarioMin/2);
        System.out.println("Digite a quantidade de horas trabalhadas");
        horasTrabalhadas = Float.parseFloat(leitor.nextLine());
        salarioBruto = (horasTrabalhadas * valorDaHora);
        valorImposto = ((salarioBruto*3) /100);
        salarioAReceber = (salarioBruto - valorImposto);
        System.out.println("O salário a receber é de R$" + (salarioAReceber));
    }
}
