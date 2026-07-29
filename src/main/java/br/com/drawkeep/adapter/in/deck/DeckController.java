package br.com.drawkeep.adapter.in.deck;

import br.com.drawkeep.application.DeckService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class DeckController {

    private final DeckService deckService;
}
