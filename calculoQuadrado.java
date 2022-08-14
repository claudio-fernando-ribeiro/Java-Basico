import java.util.Scanner;

public class calculoQuadrado {
        public static void main(String[] args) {
            Float ladoA = 0f;
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite o tamanho do lado");
            ladoA = Float.parseFloat(leitor.nextLine());
            System.out.println("A área do quadrado é: " + ladoA*ladoA);
        }
}
