import java.util.Scanner;
public class calculoPesoPessoa {
public static void main(String[] args) {
    Integer pesoPessoa = 0;
    Integer pesoMenos = 0;
    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite o peso da pessoa");
    pesoPessoa = Integer.parseInt(leitor.nextLine());
    pesoMenos = (pesoPessoa*20)/100;
    System.out.println("Se caso a pessoa engordou o novo peso é: " +  (((pesoPessoa*15) /100) + pesoPessoa));
    System.out.println("Se caso a pessoa emagreceu o novo peso é: " +  (pesoPessoa - pesoMenos));
}
}
