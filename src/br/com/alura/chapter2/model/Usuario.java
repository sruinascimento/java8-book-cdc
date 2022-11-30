package br.com.alura.chapter2.model;

public class Usuario {
    private String nome;
    private int pontos;
    private boolean moderador;

    public Usuario(String nome, int pontos) {
        this.nome = nome;
        this.pontos = pontos;
    }

    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setModerador() {
        this.moderador = true;
    }

    public boolean isModerador() {
        return moderador;
    }
}
