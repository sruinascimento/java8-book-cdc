package br.com.alura.chapter2.model;

import java.util.function.Consumer;

public class Mostrador implements Consumer<Usuario> {
    @Override
    public void accept(Usuario usuario) {
        System.out.println(" Nome -> " + usuario.getNome());
    }
}
