package br.com.drawkeep.adapter.in.mapper;

import br.com.drawkeep.adapter.in.deck.AddCardToDeckRequest;
import br.com.drawkeep.adapter.in.deck.DeckCardResponse;
import br.com.drawkeep.adapter.in.deck.DeckRequest;
import br.com.drawkeep.adapter.in.deck.DeckResponse;
import br.com.drawkeep.domain.model.Card;
import br.com.drawkeep.domain.model.Deck;
import br.com.drawkeep.domain.model.DeckCard;
import lombok.experimental.UtilityClass;

import java.util.List;

@UtilityClass
public class DeckMapper {

    public static Deck toDeck(DeckRequest request) {
        return Deck.builder()
                .name(request.name())
                .format(request.format())
                .build();
    }

    public static DeckCardResponse toDeckCardResponse(DeckCard deckCard) {
        Card card = deckCard.getCard();

        return new DeckCardResponse(
                card.getCardID(),
                card.getName(),
                deckCard.getQuantity(),
                deckCard.getSection(),
                deckCard.getCommander()
        );
    }
    public static DeckResponse toDeckResponse(Deck deck) {
        List<DeckCardResponse> cards = deck.getCards() == null
                ? List.of()
                : deck.getCards()
                .stream()
                .map(DeckMapper::toDeckCardResponse)
                .toList();

        return new DeckResponse(
                deck.getId(),
                deck.getName(),
                deck.getFormat(),
                cards
        );
    }

    public static DeckCard toDeckCard(
            AddCardToDeckRequest request,
            Deck deck,
            Card card){

        return DeckCard.builder()
                .deck(deck)
                .card(card)
                .quantity(request.quantity() == null ? 1 : request.quantity())
                .section(request.section())
                .commander(Boolean.TRUE.equals(request.commander()))
                .build();
    }
}
