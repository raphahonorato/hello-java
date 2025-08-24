import java.util.Scanner;

public class Keys {
    public static void main(String[] args){



        System.out.println("TABELA CONDICIONAL");
        System.out.println("==================================");

        System.out.printf("true   &&  true  =  %s \n", true && true);
        System.out.printf("false  &&  false = %s \n", false && false);
        System.out.printf("true   &&  false = %s \n", true && false);
        System.out.printf("false  &&  true  =  %s \n", false && true);

        System.out.println("==================================");

        System.out.printf("true   ||  false = %s \n", true || true);
        System.out.printf("false  ||  false = %s \n", false || false);
        System.out.printf("true   ||  false = %s \n", true || false);
        System.out.printf("false  ||  false = %s \n", false || true);

        System.out.println("==================================");

        System.out.printf("!true  = %s \n", !true);
        System.out.printf("!false = %s \n", !false);


//        var scanner = new Scanner(System.in);
//
//        System.out.println("Quantos anos vc tem?");
//        var age = scanner.nextInt();
//
//        System.out.println("Vc é emancipado??");
//        var isEmancipated = scanner.nextBoolean();
//        var canDrive = age >= 18  || (isEmancipated == true && age >= 16); // pode ser usado apenas (isEmancipated)
//
//        System.out.printf("Vc pode dirigir? %s \n", canDrive);





//        var scanner = new Scanner(System.in);
//
//        System.out.println("quanto é 2 + 2?");
//
//        var result = scanner.nextInt();
//        var isRight = result == 4;
//
//        if(isRight){
//
//            System.out.println("resposta é 4, vc acertou!");
//        }
//
//        else{
//            System.out.printf("Vc disse que é %d, mas a resposta é 4, vc errou ", result);
//        }

    }
}


//%d → para inteiros (int)
//
//%f → para decimais (float/double)
//
//%s → para strings
//
//%c → para caracteres (char)
//
//\n → nova linha