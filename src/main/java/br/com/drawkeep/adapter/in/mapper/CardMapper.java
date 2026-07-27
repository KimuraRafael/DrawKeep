package br.com.drawkeep.adapter.in.mapper;

import br.com.drawkeep.adapter.in.dto.CardRequest;
import br.com.drawkeep.domain.model.Card;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CardMapper {

    private static Card toCard(CardRequest cardRequest){
        return Card
                .builder()
                .cardId(cardRequest.uuid())
                .build();
    }

}
