package br.com.drawkeep.adapter.out.persistence;

import br.com.drawkeep.domain.model.Deck;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface DeckRepository extends JpaRepository<Deck, UUID> {

    @EntityGraph(attributePaths = {"cards", "cards.card"}) // Sem o EntityGraph o repositório pode trazer só os dados de deck
    Optional<Deck> findWithCardsByDeckId(UUID deckId); // Encontre um deck pelo deckId, trazendo suas cartas junto.


}
