package br.com.DrawKeep.DrawKeep.service;

import br.com.DrawKeep.DrawKeep.entity.Card;
import br.com.DrawKeep.DrawKeep.repository.CardRepository;
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
