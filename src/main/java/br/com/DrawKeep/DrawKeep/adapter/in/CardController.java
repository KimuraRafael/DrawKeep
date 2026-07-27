package br.com.DrawKeep.DrawKeep.adapter.in;

import br.com.DrawKeep.DrawKeep.domain.model.Card;
import br.com.DrawKeep.DrawKeep.application.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/drawkeep/card")
public class CardController {

    @Autowired // Injeção dependência
    private final CardService cardService;

    public CardController(CardService cardService){
        this.cardService = cardService;
    }

    @GetMapping()
    public List<Card> getAllCards(){

        return cardService.findAll();
    }

    @PostMapping
    public Card saveCard(@RequestBody Card card){
        return cardService.saveCard(card);
    }
}
