import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        diferença entre while / do while
        var i = 0;
        while (args.length > i) {
            System.out.println(args[i]);
            i++;
        }

        i = 0;

        System.out.println("=================");

        do {
            System.out.println(args[i]);
            i++;
        }
        while (args.length > i);


//        outras aplicações de while
//        var scanner = new Scanner(System.in);
//        var name = "";
//
//        while (true) {
//            System.out.println("informe um nome: ");
//            name = scanner.next();
//
//            System.out.println(name);
//
//            if(name.equalsIgnoreCase("exit")) break;
//        }


//        laço de repetição while

//        var scanner = new Scanner(System.in);
//        var name = "";
//
//
//        while(!name.equals( "sair")){
//
//            System.out.println("Digite um nome");
//            name = scanner.next();
//
//            System.out.println("olá, " + name);
//
//        }
//    System.out.println("Saiu");

//        lanços de repetição for

//        for(var i = 2; i <= 100; i++ ){
//            System.out.println(i);
//        }
    }
}
