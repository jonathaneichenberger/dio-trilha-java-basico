package br.com.dio.bootcamp.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Curso extends Atividade {

    private int cargaHoraria;


    public Curso() {
        super();
    }

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso: " + getTitulo() +
                ", " + getDescricao() +
                "\nCarga Horária:" + cargaHoraria;

    }
}