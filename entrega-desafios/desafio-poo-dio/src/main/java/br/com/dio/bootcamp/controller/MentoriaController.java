package br.com.dio.bootcamp.controller;

import br.com.dio.bootcamp.model.Mentoria;
import br.com.dio.bootcamp.service.MentoriaService;

public class MentoriaController {
    private MentoriaService mentoriaService = new MentoriaService();

    public double calcularXp(Mentoria mentoria) {
        return mentoriaService.calcularXpMentoria(mentoria);
    }
}
