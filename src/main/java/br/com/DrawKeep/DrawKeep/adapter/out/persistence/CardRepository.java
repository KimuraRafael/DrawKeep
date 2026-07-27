package br.com.DrawKeep.DrawKeep.adapter.out.persistence;

import br.com.DrawKeep.DrawKeep.domain.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CardRepository extends JpaRepository<Card, UUID> {

}
