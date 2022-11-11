import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva um nome completo: ");
        String frase = scan.nextLine();
        String[] fraseString = frase.split(" ");
        for (String s : fraseString) {
            System.out.print("!" + s + " ");
        }
    }
}
