import java.util.Scanner;

public class VerificandoValorSalarioMaiorOuMenos {
    public static void main(String[] args) {
        float salario = 0;
        float reajuste = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do salario");
        salario = Float.parseFloat(leitor.nextLine());

        if (salario <=500.00) {
            reajuste = ((salario*30f)/100f);
            {System.out.println("O valor do salario reajustado é R$" + (salario + reajuste));}
    
        } else 
            System.out.println("Não tem direito a reajuste");

    }
}
