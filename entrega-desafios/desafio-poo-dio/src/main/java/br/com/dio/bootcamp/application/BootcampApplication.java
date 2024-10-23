package br.com.dio.bootcamp.application;

import br.com.dio.bootcamp.controller.BootcampController;
import br.com.dio.bootcamp.controller.DevController;
import br.com.dio.bootcamp.controller.AtividadeController;
import br.com.dio.bootcamp.controller.MentoriaController;
import br.com.dio.bootcamp.model.*;
import br.com.dio.bootcamp.utils.XpCalculadora;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BootcampApplication {
    public static void main(String[] args) {

        // Instanciar os controladores
        BootcampController bootcampController = new BootcampController();
        DevController devController = new DevController();
        AtividadeController atividadeController = new AtividadeController();
        MentoriaController mentoriaController = new MentoriaController();

        // Instanciar novos cursos
        Curso cursoJava = new Curso("Curso de Java", "Aprenda Java do básico ao avançado", 80);
        Curso cursoPython = new Curso("Curso de Python", "Descubra a programação com Python e suas aplicações em ciência de dados e automação", 70);
        Curso cursoRuby = new Curso("Curso de Ruby", "Entenda a programação orientada a objetos com Ruby e desenvolva aplicações web com Rails", 65);
        Curso cursoJavascript = new Curso("Curso de JavaScript", "Aprenda JavaScript e suas bibliotecas para desenvolvimento front-end e back-end", 75);
        Curso cursoHtmlCss = new Curso("Curso de HTML e CSS", "Fundamentos de desenvolvimento web com HTML e CSS para iniciantes", 40);
        Curso cursoMySql = new Curso("Curso de MySQL", "Gerencie bancos de dados relacionais com MySQL e aprenda SQL", 60);
        Curso cursoCPlusPlus = new Curso("Curso de C++", "Domine a programação de sistemas e jogos com C++", 85);
        Curso cursoNodeJs = new Curso("Curso de Node.js", "Aprenda a desenvolver aplicações web escaláveis com Node.js", 70);
        Curso cursoKotlin = new Curso("Curso de Kotlin", "Explore o desenvolvimento Android com Kotlin e suas melhores práticas", 80);
        Curso cursoUnity = new Curso("Curso de Unity", "Aprenda a criar jogos 2D e 3D usando a plataforma Unity", 90);

        // Criando as mentorias
        Mentoria mentoriaJava = new Mentoria("Mentoria sobre Java", "Tire suas dúvidas sobre o mercado de trabalho e Java");
        Mentoria mentoriaPython = new Mentoria("Mentoria sobre Python", "Converse sobre projetos de ciência de dados e automação em Python");
        Mentoria mentoriaRuby = new Mentoria("Mentoria sobre Ruby", "Dúvidas sobre Ruby on Rails e desenvolvimento web");
        Mentoria mentoriaJavascript = new Mentoria("Mentoria sobre JavaScript", "Ajuda em front-end e back-end com JavaScript");
        Mentoria mentoriaHtmlCss = new Mentoria("Mentoria sobre HTML e CSS", "Orientações sobre design e desenvolvimento web básico");
        Mentoria mentoriaMySql = new Mentoria("Mentoria sobre MySQL", "Tire suas dúvidas sobre SQL e gerenciamento de bancos de dados");
        Mentoria mentoriaCPlusPlus = new Mentoria("Mentoria sobre C++", "Discussões sobre programação de sistemas e jogos");
        Mentoria mentoriaNodeJs = new Mentoria("Mentoria sobre Node.js", "Converse sobre desenvolvimento de aplicações escaláveis com Node.js");
        Mentoria mentoriaKotlin = new Mentoria("Mentoria sobre Kotlin", "Orientações sobre desenvolvimento Android e práticas recomendadas");
        Mentoria mentoriaWeb = new Mentoria("Mentoria sobre Desenvolvimento Web", "Tire suas dúvidas sobre HTML, CSS e JavaScript.");
        Mentoria mentoriaDataScience = new Mentoria("Mentoria sobre Data Science", "Converse sobre projetos de ciência de dados e análise de dados.");
        Mentoria mentoriaFullStack = new Mentoria("Mentoria sobre Desenvolvimento Full Stack", "Orientações sobre integração entre front-end e back-end.");
        Mentoria mentoriaMobile = new Mentoria("Mentoria sobre Desenvolvimento Mobile", "Dúvidas sobre desenvolvimento de aplicativos com Kotlin e Swift.");
        Mentoria mentoriaGameDev = new Mentoria("Mentoria sobre Desenvolvimento de Jogos", "Dúvidas sobre criação de jogos e uso de Unity.");


        // Criar o bootcamp
        Bootcamp bootcampSantander = new Bootcamp("Bootcamp Java Developer","Aprenda as principais tecnologias do ecossistema Java");
        Bootcamp bootcampClaro = new Bootcamp("Bootcamp Claro", "Aprenda desenvolvimento web com foco em HTML, CSS e JavaScript.");
        Bootcamp bootcampDataScience = new Bootcamp("Bootcamp Data Science", "Domine a análise de dados e machine learning com Python e SQL.");
        Bootcamp bootcampFullStack = new Bootcamp("Bootcamp Full Stack", "Seja um desenvolvedor full stack, aprendendo front-end e back-end com diversas tecnologias.");
        Bootcamp bootcampMobile = new Bootcamp("Bootcamp Mobile", "Desenvolva aplicativos para Android e iOS com Kotlin e Swift.");
        Bootcamp bootcampGameDev = new Bootcamp("Bootcamp Game Development", "Crie jogos utilizando C++ e Unity, aprendendo as melhores práticas de desenvolvimento de jogos.");

        // Adicionar atividades aos Bootcamps
        // Bootcamp bootcampSantander
        Atividade[] atividadesSantander = new Atividade[]{
                cursoJava,
                cursoJavascript,
                cursoKotlin,
                mentoriaJava,
                mentoriaJavascript,
                mentoriaCPlusPlus
        };
        bootcampController.adicionarAtividadeNoBootcamp(bootcampSantander, atividadesSantander);

        // Bootcamp Claro
        Atividade[] atividadesClaro = new Atividade[]{
                cursoHtmlCss,
                cursoNodeJs,
                cursoJavascript,
                mentoriaJavascript,
                mentoriaNodeJs,
                mentoriaWeb
        };
        bootcampController.adicionarAtividadeNoBootcamp(bootcampClaro, atividadesClaro);

        // Bootcamp Full Stack
        Atividade[] atividadesFullStack = new Atividade[]{
                cursoHtmlCss,
                cursoJavascript,
                cursoPython,
                mentoriaJavascript,
                mentoriaFullStack,
                mentoriaHtmlCss,
                mentoriaPython,
                mentoriaWeb
        };
        bootcampController.adicionarAtividadeNoBootcamp(bootcampFullStack, atividadesFullStack);

        // Bootcamp Data Science
        Atividade[] atividadesDataScience = new Atividade[]{
                cursoPython,
                cursoRuby,
                cursoMySql,
                mentoriaDataScience,
                mentoriaMySql,
                mentoriaRuby,
                mentoriaPython
        };
        bootcampController.adicionarAtividadeNoBootcamp(bootcampDataScience, atividadesDataScience);

        // Bootcamp Mobile
        Atividade[] atividadesMobile = new Atividade[]{
                cursoKotlin,
                cursoJava,
                mentoriaMobile,
                mentoriaKotlin,
                mentoriaJava
        };
        bootcampController.adicionarAtividadeNoBootcamp(bootcampMobile, atividadesMobile);

        // Bootcamp Game Development
        Atividade[] atividadesGameDev = new Atividade[]{
                cursoCPlusPlus,
                cursoUnity,
                cursoPython,
                mentoriaGameDev,
                mentoriaCPlusPlus
        };
        bootcampController.adicionarAtividadeNoBootcamp(bootcampGameDev, atividadesGameDev);

        // Criar desenvolvedores (Devs)
        Dev devJonathan = new Dev("Jonathan");
        Dev devMaria = new Dev("Maria");
        Dev devCarlos = new Dev("Carlos");
        Dev devAna = new Dev("Ana");
        Dev devPedro = new Dev("Pedro");
        Dev devJoao = new Dev("João");
        Dev devFernanda = new Dev("Fernanda");
        Dev devLucas = new Dev("Lucas");
        Dev devBeatriz = new Dev("Beatriz");
        Dev devGabriela = new Dev("Gabriela");
        Dev devPaulo = new Dev("Paulo");
        Dev devRoberta = new Dev("Roberta");

        // Inscrever os devs nos bootcamps
        devController.inscreverDev(bootcampSantander, devJonathan);
        devController.inscreverDev(bootcampClaro, devMaria);
        devController.inscreverDev(bootcampSantander, devCarlos);
        devController.inscreverDev(bootcampClaro, devAna);
        devController.inscreverDev(bootcampFullStack, devPedro);
        devController.inscreverDev(bootcampDataScience, devJoao);
        devController.inscreverDev(bootcampMobile, devFernanda);
        devController.inscreverDev(bootcampGameDev, devLucas);
        devController.inscreverDev(bootcampSantander, devBeatriz);
        devController.inscreverDev(bootcampClaro, devGabriela);
        devController.inscreverDev(bootcampFullStack, devPaulo);
        devController.inscreverDev(bootcampDataScience, devRoberta);

        // Dev progride no conteúdo
        devController.progredirDev(devJonathan);
        devController.progredirDev(devJonathan);
        devController.progredirDev(devMaria);
        devController.progredirDev(devCarlos);
        devController.progredirDev(devAna);
        devController.progredirDev(devPedro);
        devController.progredirDev(devJoao);
        devController.progredirDev(devFernanda);
        devController.progredirDev(devLucas);
        devController.progredirDev(devBeatriz);
        devController.progredirDev(devGabriela);
        devController.progredirDev(devPaulo);
        devController.progredirDev(devRoberta);
        devController.progredirDev(devMaria);

        Dev[] devs = {devJonathan, devMaria, devCarlos, devAna, devPedro, devJoao, devFernanda, devLucas, devBeatriz, devGabriela, devPaulo, devRoberta};

        for (Dev dev : devs) {
            System.out.println("Dev: " + dev.getNome());
            System.out.println("XP de Progresso: " +
                    dev.getConteudosConcluidos()
                    .stream()
                    .mapToDouble(atividadeController::calcularXp)
                    .sum());
            System.out.println("Atividades restantes para " + dev.getNome() + ": " + dev.getConteudosInscritos().size());
            System.out.println("Atividades concluídas por " + dev.getNome() + ": " + dev.getConteudosConcluidos().size());
            System.out.println("----------------- ATIVIDADES INSCRITAS ---------------------------------");
            Arrays.stream(atividadesGameDev).sequential().forEach(System.out::println);
            System.out.println("----------------- ATIVIDADES CONCLUÍDAS ---------------------------------");
            dev.getConteudosConcluidos().forEach(System.out::println);
            System.out.println("-------------------------------------------------------------------------\n");

        }
    }
}
