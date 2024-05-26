package br.com.DIO.desafio.dominio.Conteudo;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao);
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria: " + titulo + "| descricao = " + descricao + "| data = " + data;
    }

    @Override
    public Double calcularXP() {
        return XP + 20d;
    }
}
