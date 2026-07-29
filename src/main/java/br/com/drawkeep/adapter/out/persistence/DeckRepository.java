package br.com.drawkeep.adapter.out.persistence;

import br.com.drawkeep.domain.model.Deck;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface DeckRepository extends JpaRepository<Deck, UUID> {

    @EntityGraph(attributePaths = {"cards", "cards.card"})
    Optional<Deck> findWithCardsByDeckId(UUID deckId);


}
