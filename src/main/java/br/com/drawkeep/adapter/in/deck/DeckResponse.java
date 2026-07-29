package br.com.drawkeep.adapter.in.deck;

import br.com.drawkeep.domain.enums.DeckFormat;
import br.com.drawkeep.domain.model.DeckCard;

import java.util.List;
import java.util.UUID;

public record DeckResponse(UUID deckId, String name, DeckFormat format, List<DeckCard> cards) {
}
