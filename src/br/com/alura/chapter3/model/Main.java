package br.com.alura.chapter3.model;

public class Main {
    public static void main(String[] args) {

        //Usando classe anônima
        Validator<String> validaCEP = new Validator<String>() {
            @Override
            public boolean valida(String s) {
                return s.matches("\\d{5}-\\d{3}");
            }
        };

        System.out.println(validaCEP.valida("68455-767")? "CEP válido" : "CEP inválido");

        //Usando uma classe implementada
        ValidateCEP validateCEP2 = new ValidateCEP();
        System.out.println(validateCEP2.valida("684557a7")? "CEP válido" : "CEP inválido");

        //Usando LAMBDA
        Validator<String> validateCepLambda = (cep) -> {
            return cep.matches("\\d{5}-\\d{3}");
        };
        System.out.println(validateCepLambda.valida("123456789")? "CEP válido" : "CEP inválido");

        final String msgToThread = "oi!";
        new Thread(() -> {
            System.out.println("Acessando variavel de fora da Lambda " + msgToThread);
        }).start();


            //Brincando com threads!
        //Usando classe anônima
//
//        new Thread(() -> {
//            System.out.printf("#Thread1 - %s%n", validaCEP.valida("68455-767")? "CEP válido" : "CEP inválido");
//        }).start();
//
//        //Usando uma classe implementada
//        new Thread(() -> {
//            System.out.printf("#Thread2 - %s%n", validateCEP2.valida("684557a7")? "CEP válido" : "CEP inválido");
//        }).start();
//
//        //Usando LAMBDA
//        new Thread(() ->
//                System.out.printf("#Thread3 - %s%n",validateCepLambda.valida("123456789")? "CEP válido" : "CEP inválido")
//        ).start();
//
//        String msgToThread = "oi!";
//        new Thread(() -> {
//            System.out.println(msgToThread);
//        }).start();
    }
}
