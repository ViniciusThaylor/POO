package services;

import models.Raca;
import repositories.RacaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RacaService {

    @Autowired
    private RacaRepository racaRepository;

    public Raca save(Raca raca) {
        return racaRepository.save(raca);
    }

    public List<Raca> findAll() {
        return racaRepository.findAll();
    }
}
