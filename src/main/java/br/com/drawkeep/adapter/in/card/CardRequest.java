package br.com.drawkeep.adapter.in.card;

import java.math.BigDecimal;
import java.util.UUID;

public record CardRequest(  UUID oracleId,
                            String name,
                            String manaCost,
                            BigDecimal manaValue,
                            String typeLine,
                            String oracleText,
                            String power,
                            String toughness,
                            String loyalty,
                            String defense,
                            String layout) {
}
