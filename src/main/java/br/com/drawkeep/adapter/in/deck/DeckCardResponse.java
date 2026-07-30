package br.com.drawkeep.adapter.in.deck;

import br.com.drawkeep.domain.enums.DeckSection;

import java.util.UUID;

public record DeckCardResponse(
        UUID cardId,
        String cardName,
        Integer quantity,
        DeckSection section,
        Boolean commander
) {
}
