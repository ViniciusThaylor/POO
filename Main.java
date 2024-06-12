package br.com.unipar.main;

import models.*;
import services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    private CachorroService cachorroService;
    
    @Autowired
    private CorService corService;
    
    @Autowired
    private PelagemService pelagemService;
    
    @Autowired
    private RacaService racaService;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Inserir dados de exemplo
        Cor cor = new Cor(null, "Preto");
        corService.save(cor);

        Pelagem pelagem = new Pelagem(null, "Curta");
        pelagemService.save(pelagem);

        Raca raca = new Raca(null, "Bulldog");
        racaService.save(raca);

        Cachorro cachorro = new Cachorro(null, "Max", 30.0, true, "2020-01-01", raca, pelagem, cor);
        cachorroService.save(cachorro);

        // Listar todos os dados
        System.out.println("Cores:");
        corService.findAll().forEach(System.out::println);

        System.out.println("Pelagens:");
        pelagemService.findAll().forEach(System.out::println);

        System.out.println("Raças:");
        racaService.findAll().forEach(System.out::println);

        System.out.println("Cachorros:");
        cachorroService.findAll().forEach(System.out::println);
    }
}
