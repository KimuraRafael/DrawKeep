package br.com.drawkeep.adapter.in;

import br.com.drawkeep.adapter.in.dto.CardResponse;
import br.com.drawkeep.domain.model.Card;
import br.com.drawkeep.application.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/drawkeep/card")
public class CardController {

    @Autowired // Injeção dependência
    private final CardService cardService;

    public CardController(CardResponse cardService){
        this.cardService = cardService;
    }

    @GetMapping()
    public List<CardResponse> getAllCards(){

        return cardService.findAll();
    }

    @PostMapping
    public Card saveCard(@RequestBody CardResponse card){
        return cardService.saveCard(card);
    }

    @DeleteMapping("/{id}")
    public void deleteByCardId(@PathVariable UUID id){

        cardService.deleteCard(id);
    }

}
