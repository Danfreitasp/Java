import java.util.Scanner;
import java.time.Year;

public class InputTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine(); // Limpa o buffer do enter deixado pelo nextInt()

        System.out.print("Digite sua cidade: ");
        String cidade = sc.nextLine();

        int anoAtual = Year.now().getValue();
        int anoNascimento = anoAtual - idade;

        System.out.println("Olá, " + nome + "! Você nasceu em " + anoNascimento + " e mora em " + cidade + ".");

        if (idade >= 18){
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }

        sc.close();
    }
}
