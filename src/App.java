import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double media;

        Scanner sc = new Scanner(System.in);
        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();
        nota3 = sc.nextDouble();
        nota4 = sc.nextDouble();
        sc.close();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média das quatro notas é: " + media);  
    }
}
