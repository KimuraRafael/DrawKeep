package br.com.DrawKeep.DrawKeep.application;

import br.com.DrawKeep.DrawKeep.domain.model.Card;
import br.com.DrawKeep.DrawKeep.adapter.out.persistence.CardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {

    private final CardRepository repository;

    public CardService(CardRepository repository) {
        this.repository = repository;
    }

    public List<Card> findAll(){
        return repository.findAll();
    };

    public Card saveCard(Card card){
        return repository.save(card);
    };
}
