import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserir a nota 1");
        double nota1 = sc.nextDouble();

        System.out.println("Inserir nota 2");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) /2;

        System.out.printf("Média das notas = %.2f\n",media);

        if (media>=7){
            System.out.println("Aluno Aprovado!");
        }else{
            System.out.println("Aluno Reprovado");
        }

        sc.close();
    }
}
