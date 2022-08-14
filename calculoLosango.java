import java.util.Scanner;

public class calculoLosango {
        public static void main(String[] args) {
        float diagonalmaior = 0;
        float diagonalmenor = 0;
        float area = 0;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o valor da diagonal maior");
        diagonalmaior = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o valor da diagonal menor");
        diagonalmenor = Float.parseFloat(leitor.nextLine());
        area = (diagonalmaior * diagonalmenor) / 2;
        System.out.println("A area e: " + area);
        }
}
