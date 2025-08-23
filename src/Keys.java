import java.util.Scanner;

public class Keys {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        System.out.println("quanto é 2 + 2?");

        var result = scanner.nextInt();
        var isRight = result == 4;

        if(isRight){

            System.out.println("resposta é 4, vc acertou!");
        }

        else{
            System.out.printf("Vc disse que é %d, mas a resposta é 4, vc errou ", result);
        }

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