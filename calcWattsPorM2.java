import java.util.Scanner;

public class CalcWattsPorM2 {
    public static void main(String[] args) {
        
        float comodo1 = 0;
        float comodo2 = 0;
        float dimensaoA = 0;
        float dimensaoB = 0;
        float dimensaoC = 0;
        float dimensaoD = 0;
        float qtdeTotalWatts = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a dimensão A do comodo1");
        dimensaoA = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a dimensão A do comodo1");
        dimensaoB = Float.parseFloat(leitor.nextLine());

        comodo1 = dimensaoA * dimensaoB;

        System.out.println("Digite a dimensão C do comodo2");
        dimensaoC = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a dimensão D do comodo2");
        dimensaoD = Float.parseFloat(leitor.nextLine());

        comodo2 = dimensaoC * dimensaoD;
        qtdeTotalWatts = (comodo1 + comodo2) * 18;

        System.out.println("A potência a ser utilizada é de " + qtdeTotalWatts +" de Watts");

    }
}
