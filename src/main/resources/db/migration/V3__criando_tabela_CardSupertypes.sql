CREATE TABLE card_supertypes
(
    card_id   UUID        NOT NULL,
    supertype VARCHAR(50) NOT NULL,

    CONSTRAINT pk_card_supertypes PRIMARY KEY (card_id, supertype),

    CONSTRAINT fk_card_supertypes_card
        FOREIGN KEY (card_id)
            REFERENCES cards (id)
            ON DELETE CASCADE
);