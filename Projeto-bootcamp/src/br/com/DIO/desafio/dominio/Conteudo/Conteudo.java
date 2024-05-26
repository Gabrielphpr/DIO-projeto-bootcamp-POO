package br.com.DIO.desafio.dominio.Conteudo;

public abstract class Conteudo {

    protected static final double XP = 10;

    protected String titulo;
    protected String descricao;
    
    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public abstract Double calcularXP();
}
