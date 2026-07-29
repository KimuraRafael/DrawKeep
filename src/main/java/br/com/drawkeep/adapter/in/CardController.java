package br.com.drawkeep.adapter.in;

import br.com.drawkeep.adapter.in.dto.CardRequest;
import br.com.drawkeep.adapter.in.dto.CardResponse;
import br.com.drawkeep.adapter.in.mapper.CardMapper;
import br.com.drawkeep.application.CardService;
import br.com.drawkeep.domain.model.Card;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/drawkeep/card")
@RequiredArgsConstructor
public class CardController {

    private final CardService cardService;

    @GetMapping()
    public ResponseEntity<List<CardResponse>> getAllCards() {

        List<CardResponse> cards = cardService.findAll()
                .stream()
                .map(CardMapper::toCardResponse)
                .toList();

        return ResponseEntity.ok(cards);
    }

    @PostMapping
    public ResponseEntity<CardResponse> saveCard(@RequestBody CardRequest card) {
        Card newcard = CardMapper.toCard(card);
        Card saveCard = cardService.saveCard(newcard);

        return ResponseEntity.status(HttpStatus.CREATED).body(CardMapper.toCardResponse(saveCard));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteByCardId(@PathVariable UUID id) {
        cardService.deleteCard(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
