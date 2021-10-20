package be.technofuturtic.programmation_en_java.lambda.w3schoolslambda;

public class AutreMain {

    public static void main(String[] args) {

        MonString interrogation = (s) -> "Je suis Franck";
        String autre = interrogation.courir("je ");
        System.out.println(autre);
        System.out.println(interrogation.courir("moi"));
    }
}
