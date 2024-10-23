package br.com.dio.bootcamp.service;

import br.com.dio.bootcamp.model.Atividade;

public class AtividadeService {

    public double calcularXpAtividade(Atividade atividade) {
        return atividade.calcularXp();
    }
}
