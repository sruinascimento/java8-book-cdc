package br.com.alura.chapter3.model;

@FunctionalInterface
public interface Validator<T> {
    boolean valida(T t);
}
