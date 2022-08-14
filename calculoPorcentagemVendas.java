import java.util.Scanner;
import javax.swing.plaf.synth.SynthSpinnerUI;
public class calculoPorcentagemVendas {
    public static void main(String[] args) {
        Float salarioFixo = 0f;
        Float vendas = 0f;
        Float porcVendas = 0f;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do salário.");
        salarioFixo = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o valor das vendas");
        vendas = Float.parseFloat(leitor.nextLine());
        porcVendas = ((vendas*4) /100);
        System.out.println("O valor do porcentagem das vendas é: R$" + porcVendas);
        System.out.println("O valor a receber é R$: " + (porcVendas + salarioFixo));
    }
}
