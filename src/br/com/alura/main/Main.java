package br.com.alura.main;

import br.com.alura.chapter2.model.Usuario;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Rui", 150);
        Usuario user2 = new Usuario("Nara", 120);
        Usuario user3 = new Usuario("Lois", 200);

        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
        //Forma mais antiga, é um 'foreach'
//        for (Usuario usuario: usuarios) {
//            System.out.println(usuario.getNome());
//        }

        //instanciando uma classe que implementou a interface Consumer
//        usuarios.forEach(new Mostrador());

        //Classe Anônima
//        usuarios.forEach(new Consumer<Usuario>() {
//            @Override
//            public void accept(Usuario usuario) {
//                System.out.println(usuario.getNome());
//            }
//        });

            //Utilizando uma variável temporária para o Consumer
//        Consumer<Usuario> mostrador = (Usuario u) -> {
//            System.out.println(u.getNome());
//        };
//
//        Consumer<Usuario> mostradorComInferência = (u) -> {
//            System.out.println(u.getNome());
//        };
//
//        Consumer<Usuario> mostrador = u -> System.out.println(u.getNome());
//        usuarios.forEach(mostrador);


        //Por fim temos a forma mais en
//        usuarios.forEach(u -> System.out.print(" -> " + u.getNome()));


        //Ordenando pela pontuação
        Collections.sort(usuarios);
        usuarios.forEach(System.out::println);

        //Ordenando pelo Nome em ordem lexicográfica
//        Comparator<Usuario> comparacaoNome = new Comparator<Usuario>() {
//            @Override
//            public int compare(Usuario o1, Usuario o2) {
//                return o1.getNome().compareTo(o2.getNome());
//            }
//        };
//        Collections.sort(usuarios, comparacao);
        //usando Lambda
//        Comparator<Usuario> comparacaoNome = (u1, u2) -> u1.getNome().compareTo(u2.getNome());
//        usuarios.sort((u1, u2) -> u1.getNome().compareTo(u2.getNome()));
        usuarios.sort((u1, u2) -> u1.getNome().compareTo(u2.getNome()));
        usuarios.forEach(System.out::println);
    }
}
