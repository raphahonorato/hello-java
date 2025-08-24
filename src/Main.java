import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        var name = scanner.next();

        System.out.println("Quantos anos vc tem?");
        var age = scanner.nextInt();

        System.out.println("vc é emancipado?");
        var isEmancipated = scanner.nextBoolean();

        if (age >= 18){
            System.out.printf("olá %s vc tem %s, vc pode dirigir :D", name, age);
        } else if (isEmancipated && age < 18 && age > 15) {
            System.out.printf("olá %s vc tem %s, vc pode dirigir pq é emancipado :D", name, age);
        } else{
            System.out.printf("%s com %s, vc não pode dirigir :(", name, age);
        }


    }
}
