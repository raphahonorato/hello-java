import java.util.Scanner;

public class Main {
    public static void main (String[] args){

//  capturar o nome de duas pessoas, as suas idades e calcular a diferença de idade entre elas
    var scanner = new Scanner(System.in);

        System.out.println("Digite um nome: ");
        var nome1 = scanner.next();

        System.out.println("Digite uma idade: ");
        var idade1 = scanner.nextInt();


        System.out.println("Digite outro nome: ");
        var nome2 = scanner.next();

        System.out.println("Digite outra idade: ");
        var idade2 = scanner.nextInt();

        var diferencaIdade = Math.abs(idade1 - idade2);

        if(idade1 > idade2){
            System.out.println(nome1 + " é " + diferencaIdade + " anos mais velho(a) que " + nome2 + ".");
        }else if(idade1 < idade2){
            System.out.println(nome2 + " é " + diferencaIdade + " anos mais velho(a) que " + nome1 + ".");
        }else{
            System.out.println(nome1 + " e " + nome2 + " tem a mesma idade!");
        }





//      ====================================================


//    calculo area de um retângulo
//
//    var scanner = new Scanner(System.in);
//
//    System.out.println("Informe a base do retângulo: ");
//    int base = scanner.nextInt();
//
//    System.out.println("Informe a altura do retângulo: ");
//    int altura = scanner.nextInt();
//
//    int areaRetang = base * altura;
//
//    System.out.println("A area do retângulo é: " + areaRetang + " m²");



//      ====================================================

//        calculo de area de um quadrado
//
//        var scanner = new Scanner(System.in);
//
//        System.out.println("Informe o valor do lado de um quadrado:");
//
//        int lado = scanner.nextInt();
//        int area = lado * lado;
//
//        System.out.println("A area do quadrado é: " + area + " m²");


//      ====================================================

//        exercicio calculo de idade

//        var scanner = new Scanner(System.in);
//        System.out.println("Qual seu nome?");
//        var nome = scanner.next();
//
//        System.out.println("Qual seu ano de nascimento?");
//        var nascimento = scanner.nextInt();
//
//        int idade = 2025 - nascimento;
//        System.out.println("Olá " + nome + " você tem " + idade + " anos!");
    }
}