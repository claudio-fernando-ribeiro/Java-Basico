import java.util.Scanner;

public class CalculandoPorcentagemDespesas {
    public static void main(String[] args) {
/*a fórmula para regra de três é sempre salario * percdesp = despesa *100 
obs - Quando tem dois valores multiplicando devemos devemo passar um para a direita dividindo, o que ficaria:
percdesp = (despesa * 100) / salario);*/

 int despesa = 0, salario = 0, percdesp = 0;
 Scanner leitor = new Scanner(System.in);

 System.out.println("Digite o valor do seu salário");
 salario = Integer.parseInt(leitor.nextLine());
 System.out.println("Digite o valor da sua despesa");
 despesa = Integer.parseInt(leitor.nextLine());
 percdesp = ((despesa * 100) / salario);
 extracted(despesa, salario, percdesp);

    }

    private static void extracted(int despesa, int salario, int percdesp) {
        System.out.println
         ("A despesa de R$" + despesa + " representa a porcentagem de " + percdesp + "% do salário de R$" + salario);
       
             }
         
    
}
