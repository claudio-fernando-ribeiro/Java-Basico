import java.util.Scanner;

public class CalculandoValorRevelacaoFotos {
    public static void main(String[] args) {
        Float valorFoto = 0.90f;
        Float qtdeFotos = 0f;
        try (//Poderia utilizar o int ou Integer, já que é um valor inteiro.
        Scanner leitor = new Scanner(System.in)) {
            System.out.println("O valor de um filme de 24 poses é: " + valorFoto * 24);
            System.out.println("Digite o numero de fotos que deseja revelar.");
            qtdeFotos = Float.parseFloat(leitor.nextLine());
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("O valor da revelação é: " + qtdeFotos * valorFoto);
      
    }
}

