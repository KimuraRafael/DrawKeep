CREATE TABLE card_subtype_links
(
    card_id    UUID   NOT NULL,
    subtype_id BIGINT NOT NULL,

    CONSTRAINT pk_card_subtype_links PRIMARY KEY (card_id, subtype_id),
    CONSTRAINT fk_card_subtype_links_card
        FOREIGN KEY (card_id)
            REFERENCES cards (id)
            ON DELETE CASCADE,
    CONSTRAINT fk_card_subtype_links_subtype
        FOREIGN KEY (subtype_id)
            REFERENCES card_subtypes (id)
            ON DELETE CASCADE
);