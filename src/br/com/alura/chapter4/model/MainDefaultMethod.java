package br.com.alura.chapter4.model;

import br.com.alura.chapter2.model.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MainDefaultMethod {

    public static void main(String[] args) {
        //List<Usuario> usuarios = Arrays.asList(new Usuario("Paulo Silveira", 150), new Usuario("Rodrigo Turini", 120), new Usuario("Guilherme Silveira", 190));
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Paulo Silveira", 150));
        usuarios.add(new Usuario("Rodrigo Turini", 120));
        usuarios.add(new Usuario("Guilherme Silveira", 190));

        Consumer<Usuario> mostraMensagem = usuario -> System.out.print("Nome -> ");
        Consumer<Usuario> mostraNome = usuario -> System.out.printf("%s%n", usuario.getNome());
        usuarios.forEach(mostraMensagem.andThen(mostraNome).andThen(mostraMensagem.andThen(mostraNome)));

        // removendo da lista, usuários com a pontuação superior a 160 pontos
//        Predicate<Usuario> predicate = new Predicate<Usuario>() {
//            @Override
//            public boolean test(Usuario usuario) {
//                return usuario.getPontos() > 160;
//            }
//        };
//        usuarios.removeIf(predicate);
        usuarios.removeIf(u -> u.getPontos() > 160);

        usuarios.forEach(usuario -> System.out.println(usuario.getNome() + ", pontos: " + usuario.getPontos()));
    }
}
