import java.util.Scanner;

public class CalculandoValorMultaAtraso {
    public static void main(String[] args) {
        
        Float valorBoleto = 0f;
        Float qtdeDias = 0f;
        Float porcentagemDia = 0f;
        Float valorAPagar = 0f;
        Float percTotalMulta = 0f;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do boleto");
        valorBoleto = Float.parseFloat(leitor.nextLine());

        System.out.println("Digite a quantidade de dias em atraso");
        qtdeDias = Float.parseFloat(leitor.nextLine());

        System.out.println("Digite a porcentagem diaria da multa");
        porcentagemDia = Float.parseFloat(leitor.nextLine());

        percTotalMulta = (porcentagemDia*qtdeDias);
        
        valorAPagar = (valorBoleto * percTotalMulta) / 100f; 
        System.out.println("O valor do boleto é de R$" + valorAPagar);

        leitor.close();

    }
}
