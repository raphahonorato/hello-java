import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("nome de homem: ");
        var nomeHomem = scanner.next();

        System.out.println("idade homem:");
        var idadeHomem = scanner.nextInt();

        var homem = new Pessoa(nomeHomem);
        homem.setIdade(idadeHomem);


        System.out.println("nome de mulher: ");
        var nomeMulher = scanner.next();

        System.out.println("idade mulher:");
        var idadeMulher = scanner.nextInt();

        var mulher = new Pessoa(nomeMulher);
        mulher.setIdade(idadeMulher);

        System.out.println("homem nome: " + homem.getNome() + " idade: " + homem.getIdade());
        System.out.println("mulher nome: " + mulher.getNome() + " idade: " + mulher.getIdade());

    }
}
