package services;

import models.Cor;
import repositories.CorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CorService {

    @Autowired
    private CorRepository corRepository;

    public Cor save(Cor cor) {
        return corRepository.save(cor);
    }

    public List<Cor> findAll() {
        return corRepository.findAll();
    }
}
