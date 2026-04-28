import java.util.Scanner;

public class Calculadora {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

     System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        sc.nextLine();

    System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();
        sc.nextLine();

     System.out.print("Digite se quer fazer uma soma +, subtração -, multiplicação * ou divisão / : ");
        String op = sc.nextLine();

    if (num1 > 0&& num2 > 0){
        if (op.equals("+")){
            int soma = num1 + num2;
                System.out.println("O resultado da soma é" + soma);
            } 
        else if(op.equals("-"))
                {
            int sub = num1 - num2;
                System.out.println("O resultado da subtração é " + sub);
            }
        else if(op.equals("*"))
                {
            int mult = num1 * num2;
                System.out.println("O resultado da multiplicação é " + mult);
            }
        else
        {
            int div = num1 / num2;
                System.out.println("O resultado da divisão é " + div);
        }
   }
   else{
    System.out.println("Nenhum dos números pode ser ser zero.");
   }
   sc.close();
}
}
