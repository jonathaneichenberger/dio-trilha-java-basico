package br.com.dio.bootcamp.controller;

import br.com.dio.bootcamp.model.Dev;
import br.com.dio.bootcamp.model.Bootcamp;
import br.com.dio.bootcamp.service.DevService;

public class DevController {
    private DevService devService = new DevService();

    public void inscreverDev(Bootcamp bootcamp, Dev dev) {
        devService.inscreverDevNoBootcamp(dev, bootcamp);
    }

    public void progredirDev(Dev dev) {
        devService.progredirDev(dev);
    }

    public double calcularXpDev(Dev dev) {
        return devService.calcularXpDev(dev);
    }
}
