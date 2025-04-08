/*  programa exemplo para calcular
    a média entre duas notas e imprimir a situação do aluno
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.print("Digite a 1a nota --> ");
        nota1 = sc.nextDouble();
        System.out.print("Digite a 2a nota --> ");
        nota2 = sc.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.println("média final = " + df.format(media));

        if(media >= 6) {
            System.out.println("Você está APROVADO");
        }
        else {
            System.out.println("Você está REPROVADO");
        }
    }
}
