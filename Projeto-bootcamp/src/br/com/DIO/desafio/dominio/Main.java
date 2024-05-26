package br.com.DIO.desafio.dominio;

import java.time.LocalDate;

import br.com.DIO.desafio.dominio.Conteudo.Bootcamp;
import br.com.DIO.desafio.dominio.Conteudo.Conteudo;
import br.com.DIO.desafio.dominio.Conteudo.Curso;
import br.com.DIO.desafio.dominio.Conteudo.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Conteudo curso = new Curso(null, null, 0);

        Conteudo mentoria = new Mentoria(null, null, LocalDate.now());

        Bootcamp bootcamp = new Bootcamp(null, null);
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev(null);
        dev.inscrever(bootcamp);

        System.out.println("Conteudos Inscritos: " + dev.getConteudosInscritos());

        dev.progredir();
        System.out.println("Conteudos Inscritos: " + dev.getConteudosInscritos());
        System.out.println("Conteudos Inscritos: " + dev.getConteudosCompletos());
        System.out.println("XP: " + dev.calcularXPTotal());

        dev.progredir();
        System.out.println("Conteudos Inscritos: " + dev.getConteudosInscritos());
        System.out.println("Conteudos Inscritos: " + dev.getConteudosCompletos());
        System.out.println("XP: " + dev.calcularXPTotal());
    }
}
