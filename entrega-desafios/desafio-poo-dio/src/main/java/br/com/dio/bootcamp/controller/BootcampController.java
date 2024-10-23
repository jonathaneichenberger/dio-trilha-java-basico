package br.com.dio.bootcamp.controller;

import br.com.dio.bootcamp.model.Bootcamp;
import br.com.dio.bootcamp.model.Atividade;
import br.com.dio.bootcamp.service.BootcampService;



public class BootcampController {
    private BootcampService bootcampService = new BootcampService();

    public void adicionarAtividadeNoBootcamp(Bootcamp bootcamp, Atividade[] atividades) {
        for (Atividade atividade : atividades) {
            bootcampService.adicionarAtividade(bootcamp, atividade);
        }
    }
}
