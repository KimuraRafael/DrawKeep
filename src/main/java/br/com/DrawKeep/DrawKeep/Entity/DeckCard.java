package br.com.DrawKeep.DrawKeep.Entity;

import br.com.DrawKeep.DrawKeep.Enums.DeckSection;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "deck_cards")
public class DeckCard {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "deck_id")
    private Deck deck;

    @ManyToOne(optional = false)
    @JoinColumn(name = "card_id")
    private Card card;

    @Column(nullable = false)
    private Integer quantity;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DeckSection section;

    @Column(nullable = false)
    private Boolean commander = false;
}
