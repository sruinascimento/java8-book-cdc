package br.com.alura.chapter4.model;

import br.com.alura.chapter2.model.Usuario;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MainDefaultMethod {

    public static void main(String[] args) {
        List<Usuario> usuarios = Arrays.asList(new Usuario("Paulo Silveira", 150), new Usuario("Rodrigo Turini", 120), new Usuario("Guilherme Silveira", 190));

        Consumer<Usuario> mostraMensagem = usuario -> System.out.print("Nome -> ");
        Consumer<Usuario> mostraNome = usuario -> System.out.printf("%s%n", usuario.getNome());
        usuarios.forEach(mostraMensagem.andThen(mostraNome).andThen(mostraMensagem.andThen(mostraNome)));
    }
}
