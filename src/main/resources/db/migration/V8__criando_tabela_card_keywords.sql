CREATE TABLE card_keywords
(
    card_id UUID         NOT NULL,
    keyword VARCHAR(100) NOT NULL,

    CONSTRAINT pk_card_keywords PRIMARY KEY (card_id, keyword),
    CONSTRAINT fk_card_keywords_card
        FOREIGN KEY (card_id)
            REFERENCES cards (id)
            ON DELETE CASCADE
);