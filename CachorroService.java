package services;

import models.Cachorro;
import repositories.CachorroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CachorroService {

    @Autowired
    private CachorroRepository cachorroRepository;

    public Cachorro save(Cachorro cachorro) {
        return cachorroRepository.save(cachorro);
    }

    public List<Cachorro> findAll() {
        return cachorroRepository.findAll();
    }
}
