import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);


//      estrutura de controle switch
        System.out.println("informe um numero de 1 a 7: ");

        if (scanner.hasNextInt()) {

            var option = scanner.nextInt();

            var message = switch (option) {
                case 1, 7 -> "Fim de semana !!";
                case 2 -> "Segunda";
                case 3 -> "Terça";
                case 4 -> "Quarta";
                case 5 -> "Quinta";
                case 6 -> "Sexta";
//                case 7 -> System.out.println("Sábado");
                default -> "número inválido!";
            };
            System.out.println(message);
        } else {
            System.out.println("Não é um numero!");
        }

//      ====================================================
//
//
//        condicionais if else
//
//        var scanner = new Scanner(System.in);
//
//        System.out.println("informe seu nome: ");
//        String name = scanner.next();
//
//        System.out.println("informe sua idade: ");
//        int age = scanner.nextInt();
//
//        if (age >= 18) System.out.printf("Olá %s você tem %s anos, já pode dirigir!", name, age);
//        else System.out.printf("%s, você ainda é menor de idade, não pode dirigir!", name);
    }
}
