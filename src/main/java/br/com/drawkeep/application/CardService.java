package br.com.drawkeep.application;

import br.com.drawkeep.domain.model.Card;
import br.com.drawkeep.adapter.out.persistence.CardRepository;
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
