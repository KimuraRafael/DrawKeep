CREATE INDEX idx_cards_name ON cards (name);

CREATE INDEX idx_cards_type_line ON cards (type_line);

CREATE INDEX idx_deck_cards_deck_id ON deck_cards (deck_id);

CREATE INDEX idx_deck_cards_card_id ON deck_cards (card_id);

CREATE INDEX idx_card_subtype_links_subtype_id ON card_subtype_links (subtype_id);