CREATE TABLE card_subtypes (
        id BIGSERIAL PRIMARY KEY,
        name VARCHAR(100) NOT NULL,
        category VARCHAR(50),
        created_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),

        CONSTRAINT uk_card_subtypes_name UNIQUE (name)
);