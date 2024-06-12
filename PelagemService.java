package services;

import models.Pelagem;
import repositories.PelagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PelagemService {

    @Autowired
    private PelagemRepository pelagemRepository;

    public Pelagem save(Pelagem pelagem) {
        return pelagemRepository.save(pelagem);
    }

    public List<Pelagem> findAll() {
        return pelagemRepository.findAll();
    }
}
