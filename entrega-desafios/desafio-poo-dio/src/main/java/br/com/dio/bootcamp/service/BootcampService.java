package br.com.dio.bootcamp.service;

import br.com.dio.bootcamp.model.Bootcamp;
import br.com.dio.bootcamp.model.Atividade;

public class BootcampService {

    public void adicionarAtividade(Bootcamp bootcamp, Atividade atividade) {
        bootcamp.getAtividades().add(atividade);
    }

    public void removerAtividade(Bootcamp bootcamp, Atividade atividade) {
        bootcamp.getAtividades().remove(atividade);
    }
}
