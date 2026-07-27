package br.com.drawkeep.adapter.out.persistence;

import br.com.drawkeep.domain.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CardRepository extends JpaRepository<Card, UUID> {

}
