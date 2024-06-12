package repositories;

import models.Pelagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PelagemRepository extends JpaRepository<Pelagem, Long> {
}
