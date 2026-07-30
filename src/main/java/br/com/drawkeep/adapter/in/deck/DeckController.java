package br.com.drawkeep.adapter.in.deck;

import br.com.drawkeep.adapter.in.mapper.DeckMapper;
import br.com.drawkeep.application.DeckService;
import br.com.drawkeep.domain.model.Deck;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/drawkeep/decks")
@RequiredArgsConstructor
public class DeckController {

    private final DeckService deckService;

//    @GetMapping("/{deckId}/decklist")
//    public ResponseEntity<DeckResponse> findDecklist(@PathVariable UUID deckId){
//
//        Deck deck = deckService.findDecklist(deckId);
//        return DeckMapper.toDeckResponse(deck);
//
//    }

}
