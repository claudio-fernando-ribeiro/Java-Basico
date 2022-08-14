import java.util.Scanner;

public class calculoTrapezio {
    public static void main(String[] args) {
        float  basemenor = 0;
        float  basemaior = 0;
        float  altura  = 0;
        float area = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o tamanho da base menor");
        basemenor = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o tamanho da base maior");
        basemaior = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o tamanho a altura");
        altura = Float.parseFloat(leitor.nextLine());
        area = ((basemaior + basemenor)*altura)/2f;
        System.out.println("A área do trapézio é: " + area);


    }
    
}
