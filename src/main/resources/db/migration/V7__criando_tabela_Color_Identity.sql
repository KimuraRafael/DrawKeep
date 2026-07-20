CREATE TABLE card_color_identity (
        card_id UUID NOT NULL,
        color VARCHAR(5) NOT NULL,

        CONSTRAINT pk_card_color_identity PRIMARY KEY (card_id, color),
        CONSTRAINT fk_card_color_identity_card
        FOREIGN KEY (card_id)
        REFERENCES cards (oracle_id)
        ON DELETE CASCADE
);