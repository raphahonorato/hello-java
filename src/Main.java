import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        Escreva um código que o usuário entre com um primeiro número,
//        um segundo número maior que o primeiro e escolhe entre a opção par e impar,
//        com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial)
//        no intervalo de números informados, incluindo os números informados e em ordem decrescente;


        var scanner = new Scanner(System.in);

        System.out.println("informe um número: ");
        var numero1 = scanner.nextInt();

        System.out.println("informe um número maior: ");
        var numero2 = scanner.nextInt();

        System.out.println("Escolha par ou ímpar: ");
        var parImpar = scanner.next();


        // Ajusta o início para o tipo desejado
        if (parImpar.equalsIgnoreCase("p")) {
            if (numero1 % 2 != 0) numero1++; // se for ímpar, pula para o próximo par

        } else if (parImpar.equalsIgnoreCase("i")) {
            if (numero1 % 2 == 0) numero1++; // se for par, pula para o próximo ímpar
        }

        for (int i = numero1; i <= numero2; i += 2) {
            System.out.println(i);
        }

        scanner.close();


//        if((parImpar.equalsIgnoreCase("p"))){
//            for(var i = numero1; i <= numero2; i+= 2){
//                System.out.println(i);
//            }
//        }else if((parImpar.equalsIgnoreCase("i"))){
//            for(var i = numero1; i <= numero2; i += 2){
//                System.out.println(i);
//            }
//        }else{
//            System.out.println("opção invalida!");
//        }


//        ========================================


//        Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de 0 na divisão, números menores que o primeiro número devem ser ignorados


//      ========================================


//        CÁLCULO DE IMC
//      IMC  peso / (altura * altura)
//        <= 18,5 --- abaixo do peso
//        18,6 - 24,9 ---- ideal
//        25,0 - 29,9 ---levemente acima
//        30  - 34,9  ---- obesidade grau 1
//        35,0 - 39,9  ---- obesidade grau 2
//        > 40 ----obesidade grau 3

//        var scanner = new Scanner(System.in);
//
//        System.out.println("Digite seu peso: ");
//        double peso = scanner.nextDouble();
//
//        System.out.println("Digite sua altura: ");
//        double altura = scanner.nextDouble();
//
//        double imc = peso / (altura * altura);
//
//        System.out.printf("Seu IMC é: %.2f \n", imc);
//
//        if (imc <= 18.5) {
//            System.out.println("Abaixo do peso");
//        } else if (imc >= 18.6 && imc <= 24.9) {
//            System.out.println("Peso ideal");
//        } else if (imc >= 25.0 && imc <= 29.9) {
//            System.out.println("Levemente acima");
//        } else if (imc >= 30 && imc <= 34.9) {
//            System.out.println("Obesidade grau 1");
//        } else if (imc >= 35.0 && imc <= 39.9) {
//            System.out.println("Obesidade grau 2(SEVERA)");
//        } else if (imc > 40) {
//            System.out.println("Obesidade grau 3(MÓRBIDA)");
//        }


//        ==============================


//        tabuada
//        var scanner = new Scanner(System.in);
//
//        System.out.println("Informe um numero: ");
//        var num = scanner.nextInt();
//
//        for (var i = 1; i <= 10; i++) {
//            System.out.printf("%d x %d = %d \n", num, i, num * i);
//        }
    }
}
