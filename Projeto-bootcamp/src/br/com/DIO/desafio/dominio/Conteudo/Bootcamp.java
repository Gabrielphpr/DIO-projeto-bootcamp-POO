package br.com.DIO.desafio.dominio.Conteudo;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

import br.com.DIO.desafio.dominio.Dev;

public class Bootcamp {
    private String nome;
    private String descricao;
    private LocalDate datainicial = LocalDate.now();
    private LocalDate datafinal = datainicial.plusDays(45);

    private Set<Dev> listaDeDevs = new LinkedHashSet<Dev>();
    private Set<Conteudo> conteudos = new LinkedHashSet<Conteudo>();
    public Object getListaDeDevs;
    

    
    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }


    public void setListaDeDevs(Set<Dev> listaDeDevs) {
        this.listaDeDevs = listaDeDevs;
    }
    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }


    public String getNome() {
        return nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public LocalDate getDatainicial() {
        return datainicial;
    }
    public LocalDate getDatafinal() {
        return datafinal;
    }
    public Set<Dev> getListaDeDevs() {
        return listaDeDevs;
    }
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + ((datainicial == null) ? 0 : datainicial.hashCode());
        result = prime * result + ((datafinal == null) ? 0 : datafinal.hashCode());
        result = prime * result + ((listaDeDevs == null) ? 0 : listaDeDevs.hashCode());
        result = prime * result + ((conteudos == null) ? 0 : conteudos.hashCode());
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
        Bootcamp other = (Bootcamp) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (datainicial == null) {
            if (other.datainicial != null)
                return false;
        } else if (!datainicial.equals(other.datainicial))
            return false;
        if (datafinal == null) {
            if (other.datafinal != null)
                return false;
        } else if (!datafinal.equals(other.datafinal))
            return false;
        if (listaDeDevs == null) {
            if (other.listaDeDevs != null)
                return false;
        } else if (!listaDeDevs.equals(other.listaDeDevs))
            return false;
        if (conteudos == null) {
            if (other.conteudos != null)
                return false;
        } else if (!conteudos.equals(other.conteudos))
            return false;
        return true;
    }
}
