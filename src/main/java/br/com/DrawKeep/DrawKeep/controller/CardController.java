package br.com.DrawKeep.DrawKeep.controller;

import br.com.DrawKeep.DrawKeep.entity.Card;
import br.com.DrawKeep.DrawKeep.service.CardService;
import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/drawkeep/category")
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
}
