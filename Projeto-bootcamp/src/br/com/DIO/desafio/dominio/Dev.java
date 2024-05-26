package br.com.DIO.desafio.dominio;

import br.com.DIO.desafio.dominio.Conteudo.Bootcamp;
import br.com.DIO.desafio.dominio.Conteudo.Conteudo;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Optional;

public class Dev {

    private String nome;

    public Dev(String nome) {
        this.nome = nome;
    }

    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<Conteudo>();
    private Set<Conteudo> conteudosCompletos = new LinkedHashSet<Conteudo>();

    public void inscrever (Bootcamp bootcamp){
        conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getListaDeDevs().add(this);
    }

    public void progredir (){
        Optional<Conteudo> conteudoCompleto = this.conteudosInscritos.stream().findFirst();
        if(conteudoCompleto.isPresent()){
            this.conteudosCompletos.add(conteudoCompleto.get());
            this.conteudosInscritos.remove(conteudoCompleto.get());
        }
        else System.err.println("Não há conteudos inscritos... Se inscreva em algum");
    }

    public Double calcularXPTotal(){
        return this.conteudosCompletos.stream()
            .mapToDouble(conteudo -> conteudo.calcularXP())
            .sum();
    }

    public String getNome() {
        return nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public Set<Conteudo> getConteudosCompletos() {
        return conteudosCompletos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((conteudosInscritos == null) ? 0 : conteudosInscritos.hashCode());
        result = prime * result + ((conteudosCompletos == null) ? 0 : conteudosCompletos.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dev other = (Dev) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (conteudosInscritos == null) {
            if (other.conteudosInscritos != null)
                return false;
        } else if (!conteudosInscritos.equals(other.conteudosInscritos))
            return false;
        if (conteudosCompletos == null) {
            if (other.conteudosCompletos != null)
                return false;
        } else if (!conteudosCompletos.equals(other.conteudosCompletos))
            return false;
        return true;
    }
}
