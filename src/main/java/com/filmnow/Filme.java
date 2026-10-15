package com.filmnow;

import java.util.Objects;

/**
 * filme com nome ano e local
 */
public class Filme {
    private String nome;
    private String ano;
    private String local;

    /**
     * cria filme
     * @param nome nome do filme
     * @param ano ano do filme
     * @param local local do filme
     */
    public Filme(String nome, String ano, String local) {
        this.nome = nome;
        this.ano = ano;
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public String getAno() {
        return ano;
    }

    public String getLocal() {
        return local;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Filme filme = (Filme) obj;
        return Objects.equals(nome, filme.nome) && Objects.equals(ano, filme.ano);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, ano);
    }

    @Override
    public String toString() {
        return nome + ", " + ano;
    }
}
