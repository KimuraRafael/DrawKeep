package br.com.DrawKeep.DrawKeep.entity;

import br.com.DrawKeep.DrawKeep.entity.enums.CardSupertype;
import br.com.DrawKeep.DrawKeep.entity.enums.CardType;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "cards")
public class Card {

    @Id
    @Column(name = "oracle_id", nullable = false, updatable = false)
    private UUID cardID;

    @Column(nullable = false)
    private String name;

    @Column(name = "mana_cost")
    private String manaCost;

    @Column(name = "mana_value")
    private BigDecimal manaValue;

    @Column(name = "type_line")
    private String typeLine;

    @Column(name = "oracle_text", columnDefinition = "TEXT")
    private String oracleText;

    private String power;
    private String toughness;
    private String loyalty;
    private String defense;

    /*
     * Enums: CardType
     */
    @ElementCollection
    @CollectionTable(
            name = "card_types",
            joinColumns = @JoinColumn(name = "card_id")
    )
    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false)
    private Set<CardType> types = new HashSet<>();

    /*
     * Enums: CardSupertype
     */
    @ElementCollection
    @CollectionTable(
            name = "card_supertypes",
            joinColumns = @JoinColumn(name = "card_id")
    )
    @Enumerated(EnumType.STRING)
    @Column(name = "supertype", nullable = false)
    private Set<CardSupertype> supertypes = new HashSet<>();

    /*
     * Entidades: CardSubtype
     */
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "card_subtypes",
            joinColumns = @JoinColumn(name = "card_id"),
            inverseJoinColumns = @JoinColumn(name = "subtype_id"),
            uniqueConstraints = {
                    @UniqueConstraint(
                            name = "uk_card_subtype",
                            columnNames = {"card_id", "subtype_id"}
                    )
            }
    )
    private Set<CardSubtype> subtypes = new HashSet<>();

    /*
     * Strings: cores da carta
     */
    @ElementCollection
    @CollectionTable(
            name = "card_colors",
            joinColumns = @JoinColumn(name = "card_id")
    )
    @Column(name = "color", nullable = false)
    private Set<String> colors = new HashSet<>();

    /*
     * Strings: identidade de cor
     */
    @ElementCollection
    @CollectionTable(
            name = "card_color_identity",
            joinColumns = @JoinColumn(name = "card_id")
    )
    @Column(name = "color", nullable = false)
    private Set<String> colorIdentity = new HashSet<>();

    /*
     * Strings: palavras-chave
     */
    @ElementCollection
    @CollectionTable(
            name = "card_keywords",
            joinColumns = @JoinColumn(name = "card_id")
    )
    @Column(name = "keyword", nullable = false)
    private Set<String> keywords = new HashSet<>();

    private String layout;

    protected Card() {
    }

    public UUID getCardID() {
        return cardID;
    }

    public void setCardID(UUID cardID) {
        this.cardID = cardID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManaCost() {
        return manaCost;
    }

    public void setManaCost(String manaCost) {
        this.manaCost = manaCost;
    }

    public BigDecimal getManaValue() {
        return manaValue;
    }

    public void setManaValue(BigDecimal manaValue) {
        this.manaValue = manaValue;
    }

    public Set<String> getColorIdentity() {
        return colorIdentity;
    }

    public void setColorIdentity(Set<String> colorIdentity) {
        this.colorIdentity = colorIdentity;
    }

    public Set<CardSubtype> getSubtypes() {
        return subtypes;
    }

    public void setSubtypes(Set<CardSubtype> subtypes) {
        this.subtypes = subtypes;
    }

    public String getTypeLine() {
        return typeLine;
    }

    public void setTypeLine(String typeLine) {
        this.typeLine = typeLine;
    }

    public String getOracleText() {
        return oracleText;
    }

    public void setOracleText(String oracleText) {
        this.oracleText = oracleText;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getToughness() {
        return toughness;
    }

    public void setToughness(String toughness) {
        this.toughness = toughness;
    }

    public String getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(String loyalty) {
        this.loyalty = loyalty;
    }

    public String getDefense() {
        return defense;
    }

    public void setDefense(String defense) {
        this.defense = defense;
    }

    public Set<CardType> getTypes() {
        return types;
    }

    public void setTypes(Set<CardType> types) {
        this.types = types;
    }

    public Set<CardSupertype> getSupertypes() {
        return supertypes;
    }

    public void setSupertypes(Set<CardSupertype> supertypes) {
        this.supertypes = supertypes;
    }

    public Set<String> getColors() {
        return colors;
    }

    public void setColors(Set<String> colors) {
        this.colors = colors;
    }

    public Set<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(Set<String> keywords) {
        this.keywords = keywords;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }
}