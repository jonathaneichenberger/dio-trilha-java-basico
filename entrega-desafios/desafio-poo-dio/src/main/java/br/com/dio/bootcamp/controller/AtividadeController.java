package br.com.dio.bootcamp.controller;

import br.com.dio.bootcamp.model.Atividade;
import br.com.dio.bootcamp.service.AtividadeService;

public class AtividadeController {
    private AtividadeService atividadeService = new AtividadeService();

    public double calcularXp(Atividade atividade) {
        return atividadeService.calcularXpAtividade(atividade);
    }


}
