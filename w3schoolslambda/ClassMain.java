package be.technofuturtic.programmation_en_java.lambda.w3schoolslambda;

public class ClassMain {

    public static void main(String[] args) {

        MonString exlamation = (s) -> s + "cour vite!";
        MonString interrogation = (s) -> "cour vite?";
//        quoi("Max ", exlamation);
        String autre = interrogation.courir("je ");
        System.out.println(autre);
    }

//    public static void quoi(String s, MonString comment) {
//
//        String resultat = comment.courir(s);
//        System.out.println(resultat);
//    }
}
