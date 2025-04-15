import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media;

        System.out.print("Informe sua média em programação --> ");
        media = sc.nextDouble();

        if(media >= 6) {
            System.out.println("APROVADO");
        }
        else {
            if(media < 4) {
                System.out.println("REPROVADO");
            }
            else {
                System.out.println("EXAME");
            }
        }


    }
}
