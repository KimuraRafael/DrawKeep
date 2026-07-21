package br.com.DrawKeep.DrawKeep.controller;

import br.com.DrawKeep.DrawKeep.entity.Card;
import br.com.DrawKeep.DrawKeep.service.CardService;
import jdk.jfr.Category;
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
