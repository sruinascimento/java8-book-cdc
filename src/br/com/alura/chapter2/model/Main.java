package br.com.alura.chapter2.model;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Rui", 150);
        Usuario user2 = new Usuario("Nara", 120);
        Usuario user3 = new Usuario("Lois", 200);

        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

        for (Usuario usuario: usuarios) {
            System.out.println(usuario.getNome());
        }

    }
}
