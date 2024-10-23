package br.com.dio.bootcamp.service;

import br.com.dio.bootcamp.model.Mentoria;

public class MentoriaService {

    public double calcularXpMentoria(Mentoria mentoria) {
        return mentoria.calcularXp();
    }
}
