package br.com.DIO.desafio.dominio.Conteudo;

public class Curso extends Conteudo{

    private int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso: " + titulo + "| descricao = " + descricao + "| horario = " + cargaHoraria;
    }

    @Override
    public Double calcularXP() {
        return XP * cargaHoraria;
    }

    
}
