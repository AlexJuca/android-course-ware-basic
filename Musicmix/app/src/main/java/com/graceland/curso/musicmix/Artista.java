package com.graceland.curso.musicmix;

/**
 * Created by alexandre on 8/18/17.
 */

public class Artista {
    private String nome;
    private String altura;
    private String fotoPerfil;
    private String idade;
    private String descriçao;
    String [] estiloMusical;
    String [] listadeMusicas;

    public Artista(){

    }

    public Artista(String nome, String altura, String fotoPerfil, String idade, String descriçao, String[] estiloMusical, String[] listadeMusicas) {
        this.nome = nome;
        this.altura = altura;
        this.fotoPerfil = fotoPerfil;
        this.idade = idade;
        this.descriçao = descriçao;
        this.estiloMusical = estiloMusical;
        this.listadeMusicas = listadeMusicas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getDescriçao() {
        return descriçao;
    }

    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }

    public String[] getEstiloMusical() {
        return estiloMusical;
    }

    public void setEstiloMusical(String[] estiloMusical) {
        this.estiloMusical = estiloMusical;
    }

    public String[] getListadeMusicas() {
        return listadeMusicas;
    }

    public void setListadeMusicas(String[] listadeMusicas) {
        this.listadeMusicas = listadeMusicas;
    }
}

