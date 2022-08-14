import java.util.Scanner;

public class calculoDescontoProduto {
    public static void main(String[] args) {
        
        Float produto = 0f;
        Float valorDesc = 0f;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do produtor");
        produto = Float.parseFloat(leitor.nextLine());
        valorDesc = ((produto*10) / 100);

        System.out.println("O valor do desconto é: R$" + valorDesc);
        System.out.println("");
        System.out.println("Novo valor do protudo é: R$" + (produto - valorDesc));
        
        leitor.close();
    }
    
}
