package br.com.drawkeep.application;

import br.com.drawkeep.adapter.out.persistence.CardRepository;
import br.com.drawkeep.adapter.out.persistence.DeckRepository;
import br.com.drawkeep.domain.model.Card;
import br.com.drawkeep.domain.model.Deck;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class DeckService {

    private final DeckRepository repository;


    public List<Deck> findAll(){
        return repository.findAll();
    };

    public Optional<Deck> findDecklist(UUID deckId){
        return  repository.findWithCardsByDeckId(deckId);
    }

    public Deck saveDeck(Deck deck){
        return repository.save(deck);
    };

    public void deleteDeck(UUID id){
        repository.deleteById(id);
    }
}
