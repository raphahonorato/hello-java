import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    //tipos primitivos
        byte baite = 1;
        short chorte = 1;
        int inteiro = 1;
        long longo = 1L;
        float decimal = 1.0f;
        double decimal2 = 1.0d;
        char caractere = '1'; //aspas simples
        boolean boleano = true; //ou 'false'

        System.out.println(
                " byte: " + baite + ",\n " +
                "short: " + chorte + ",\n " +
                "int: " + inteiro + ",\n " +
                "long: " + longo + ",\n " +
                "float: " + decimal + ",\n " +
                "double: " + decimal2 + ",\n " +
                "char: " + caractere + ",\n " +
                "boolean: "+ boleano
        );



        //variavel global, (boa prática declarar em maiúsculas e underline)
//private final static  String WELCOME_MSG = "Olá, qual o seu nome?";
//
//    public static void main(String[] args) {
//
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println(WELCOME_MSG);
//        String name = scanner.next();
//
//        System.out.println("Qual sua idade?");
//        int age = scanner.nextInt();
//
//        System.out.printf("Oi %s, vc tem %s anos!!", name, age);


//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("seu nome");
//        String name = scanner.next();
//
//        System.out.println("sua idade");
//        int age = scanner.nextInt();
//
//        System.out.printf("oi %s, vc tem %s anos", name, age);


//forma um pouco reduzida de declaração de variaveis

//    public static void main(String[] args) {
//        var scanner = new Scanner(System.in);
//        System.out.println("seu nome");
//        var name = scanner.next();
//        System.out.println("sua idade");
//        var age = scanner.nextInt();
//        System.out.printf("oi %s, vc tem %s anos", name, age);
//    }
    }
}