import java.util.Scanner;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class horasEDiasTrabalhados {
    public static void main(String[] args) {
        //declaração de variáveis
        Integer dias=0;
        Integer horas=0; 
        Scanner leitor = new Scanner(System.in);
        //comando para importar Scanner (Ctrl+.)
        System.out.println("Digite o número de dias trabalhados no mês");
        //conversão entre variável tipo objeto em variável tipo primitivo
        dias = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o número de horas trabalhadas por dia");
        horas = Integer.parseInt(leitor.nextLine());
        //poderia ser da forma abaixo
        //Integer horasMes = dias * horas;
        //System.out.println("Total de horas trabalhadas no mês: " + horasMes);      
        System.out.println("total de horas trabalhadas: " + dias * horas);      
         }
    }

        /*nota2 = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a terceira nota");
        nota3 = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a quarta nota");
        nota4 = Float.parseFloat(leitor.nextLine());
media = ((nota1+nota2+nota3+nota4) / 4);
System.out.println("A média do aluno é:" + media);
System.out.println("Digite o percentual de presença do aluno");
percPresenca = Float.parseFloat(leitor.nextLine());      
if (percPresenca >=70 && media >=7.00) {
    System.out.println("Aluno aprovado");
} else {
        System.out.println("Aluno reprovado");
    }
    leitor.close();
}
}
}*/
