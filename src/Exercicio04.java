import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;

        System.out.print("Informe o valor x ");
        x = sc.nextDouble();
        if(x > 5 || x < -5) {
            y = 8 / Math.sqrt(x * x - 25);
            System.out.println("y = " + y);
        }
        else {
            System.out.println("valor inválido para x");
        }
    }
}
