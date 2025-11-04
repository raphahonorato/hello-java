public class Pessoa {

    private final String nome;
    private int idade;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }


//    exemplo
//    private static String teste;
//
//    public static void setTeste(String testeParam){
//        teste = testeParam;
//    }
//
//    public static String getTeste(){
//        return teste;
//    }
}
