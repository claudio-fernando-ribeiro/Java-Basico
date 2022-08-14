import java.util.Scanner;

import javax.sound.sampled.FloatControl;

public class CalculandoImposto {  
    public static void main(String[] args) {
        
        float salario = 0;
        float cheque1 = 0;
        float cheque2 = 0;
        float impostoCheque1 = 0;
        float impostoCheque2 = 0;
        double imposto = 0.38;
        float saldoEmConta = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do salário.");
        salario = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o valor do primeiro cheque.");
        cheque1 = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o valor do segundo cheque.");
        cheque2 = Float.parseFloat(leitor.nextLine());

        impostoCheque1 = (float) ((cheque1*imposto)/100);
        impostoCheque2 = (float) ((cheque2*imposto)/100);
        saldoEmConta = salario - (cheque1+cheque2+impostoCheque1+impostoCheque2);
        System.out.println("O saldo em conta é de R$" + saldoEmConta);


        
    }
    
}
