package br.com.dio.bootcamp.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
import java.util.Random;

@EqualsAndHashCode(callSuper = true)
@Data
public class Mentoria extends Atividade {

    private LocalDate dataMentoria;

    public Mentoria() {
    }
    public Mentoria(String titulo, String descricao) {
        super(titulo, descricao);
        this.dataMentoria = gerarDataAleatoria(); // Gera uma Data entre Hoje e 30 dias posteriores
    }

    private LocalDate gerarDataAleatoria() {
        LocalDate hoje = LocalDate.now();
        long diasAleatorios = new Random().nextInt(31);
        return hoje.plusDays(diasAleatorios);
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "Curso: " + getTitulo() +
                ", " + getDescricao() +
                "\nData da Mentoria: " + dataMentoria;

    }


}