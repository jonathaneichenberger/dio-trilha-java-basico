package br.com.dio.bootcamp.service;

import br.com.dio.bootcamp.model.Dev;
import br.com.dio.bootcamp.model.Bootcamp;

public class DevService {

    public void inscreverDevNoBootcamp(Dev dev, Bootcamp bootcamp) {
        dev.inscreverBootcamp(bootcamp);
    }

    public void progredirDev(Dev dev) {
        dev.progredir();
    }

    public double calcularXpDev(Dev dev) {
        return dev.calcularTotalXp();
    }
}
