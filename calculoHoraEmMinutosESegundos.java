import java.util.Scanner;

public class CalculoHoraEmMinutosESegundos {
    public static void main(String[] args) {
        
        float hora = 0;
        float minutos = 0;
        float segundos = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a quantidade de horas");
        hora = Float.parseFloat(leitor.nextLine());

        minutos = hora*60;
        segundos = minutos*60;

        System.out.println("A quantidade de minutos é: " + minutos);
        System.out.println("A quantidade de segundos é: " + segundos);

    }
}
