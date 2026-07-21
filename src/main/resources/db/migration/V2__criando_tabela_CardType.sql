CREATE TABLE card_types
(
    card_id UUID        NOT NULL,
    type    VARCHAR(50) NOT NULL,

    CONSTRAINT pk_card_types PRIMARY KEY (card_id, type),
    CONSTRAINT fk_card_types_card
        FOREIGN KEY (card_id)
            REFERENCES cards (oracle_id)
            ON DELETE CASCADE
);