package br.com.drawkeep.adapter.in.mapper;

import br.com.drawkeep.adapter.in.dto.CardRequest;
import br.com.drawkeep.adapter.in.dto.CardResponse;
import br.com.drawkeep.domain.model.Card;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CardMapper {

    public static Card toCard(CardRequest request){
        return Card.builder()
                .oracleId(request.oracleId())
                .name(request.name())   .oracleId(request.oracleId())
                .name(request.name())
                .manaCost(request.manaCost())
                .manaValue(request.manaValue())
                .typeLine(request.typeLine())
                .oracleText(request.oracleText())
                .power(request.power())
                .toughness(request.toughness())
                .loyalty(request.loyalty())
                .defense(request.defense())
                .layout(request.layout())
                .build();

    }

    public static CardResponse toCardResponse(Card card){
        return new CardResponse(
                card.getCardID(),
                card.getOracleId(),
                card.getName()
        );
    }

}
