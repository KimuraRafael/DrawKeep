package br.com.drawkeep.adapter.in.deck;

import br.com.drawkeep.domain.enums.DeckFormat;


public record DeckRequest(
        String name,
        DeckFormat format) {
}
