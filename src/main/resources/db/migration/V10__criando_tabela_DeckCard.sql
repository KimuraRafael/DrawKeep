CREATE TABLE deck_cards
(
    id         UUID PRIMARY KEY     DEFAULT gen_random_uuid(),
    deck_id    UUID        NOT NULL,
    card_id    UUID        NOT NULL,
    quantity   INTEGER     NOT NULL DEFAULT 1,
    section    VARCHAR(50) NOT NULL DEFAULT 'MAINBOARD',
    commander  BOOLEAN     NOT NULL DEFAULT FALSE,
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),

    CONSTRAINT fk_deck_cards_deck
        FOREIGN KEY (deck_id)
            REFERENCES decks (id)
            ON DELETE CASCADE,

    CONSTRAINT fk_deck_cards_card
        FOREIGN KEY (card_id)
            REFERENCES cards (oracle_id)
            ON DELETE RESTRICT,

    CONSTRAINT ck_deck_cards_quantity_positive
        CHECK (quantity > 0),

    CONSTRAINT uk_deck_cards_deck_card_section
        UNIQUE (deck_id, card_id, section)
);