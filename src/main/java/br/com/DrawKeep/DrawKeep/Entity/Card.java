package br.com.DrawKeep.DrawKeep.Entity;

import br.com.DrawKeep.DrawKeep.Enums.CardSupertype;
import br.com.DrawKeep.DrawKeep.Enums.CardType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "cards")
public class Card {

    @Id
    private UUID cardID;
    private String name;

    private String manaCost;
    private BigDecimal manaValue;

    private String typeLine;
    private String oracleText;

    private String power;
    private String toughness;
    private String loyalty;
    private String defense;

    private List<CardType> types;
    private List<CardSupertype> supertypes;
    private List<CardSubtype> subtypes;

    private List<String> colors;
    private List<String> colorIdentity;
    private List<String> keywords;

    private String layout;
}
