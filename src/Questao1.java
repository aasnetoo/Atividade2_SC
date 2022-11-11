import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String frase = scan.nextLine();
        String[] fraseString = frase.split(",");
        int soma = 0;
        for (String s : fraseString) {
            System.out.println(s.trim());
        }
        String[] fraseNumeros = frase.split("([\\D]+[:][ ])");
        for (int j = 1; j < fraseNumeros.length; j++) {
            soma += Integer.parseInt(fraseNumeros[j]);
        }
        System.out.println("Total: "+soma);
        }
}
