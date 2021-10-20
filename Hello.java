package be.technofuturtic.programmation_en_java.lambda;

public class Hello {

    public static void main(String[] args) {

        System.out.println("Hello World! via sout");
        String bonjour = "Hello World! via variable";
        System.out.println(bonjour);
        Salutation salutation = new Salutation();
        System.out.println(salutation.getSalut());
//        via lambda?
       FctInterface hello = (s) -> "Hello World! via lambda";
        System.out.println(hello.salut("à quoi sert le s?"));
//        via method reference?
//        Salutation::getSalut();
    }
}
