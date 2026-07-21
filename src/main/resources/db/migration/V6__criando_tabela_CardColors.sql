CREATE TABLE card_colors
(
    card_id UUID       NOT NULL,
    color   VARCHAR(5) NOT NULL,

    CONSTRAINT pk_card_colors PRIMARY KEY (card_id, color),
    CONSTRAINT fk_card_colors_card
        FOREIGN KEY (card_id)
            REFERENCES cards (oracle_id)
            ON DELETE CASCADE
);