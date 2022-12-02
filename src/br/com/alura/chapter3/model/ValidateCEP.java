package br.com.alura.chapter3.model;

public class ValidateCEP implements Validator<String> {

    @Override
    public boolean valida(String cep) {
        return cep.matches("\\d{5}-\\d{3}");
    }
}
