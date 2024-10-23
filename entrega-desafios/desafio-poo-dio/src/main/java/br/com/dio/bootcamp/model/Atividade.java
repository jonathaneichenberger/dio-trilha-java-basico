package br.com.dio.bootcamp.model;

import br.com.dio.bootcamp.utils.XpCalculadora;
import lombok.Data;


@Data
public abstract class Atividade implements XpCalculadora {

    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;


    public Atividade() {

    }

    public Atividade(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }


}