import java.util.Scanner;

public class conversaoKgEmKgr {
    public static void main(String[] args) {
        Float pesokg =0f;
        Float pesoGramas =0f;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o peso da pessoa");
        pesokg = Float.parseFloat(leitor.nextLine());
        pesoGramas = pesokg *1000;


        System.out.println("O peso em gramas é: " + pesoGramas);
    }
    
}
