CREATE
EXTENSION IF NOT EXISTS pgcrypto;

CREATE TABLE cards
(
    id               UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    oracle_id        UUID UNIQUE,
    scryfall_id      UUID UNIQUE,
    name             VARCHAR(255) NOT NULL,
    mana_cost        VARCHAR(100),
    mana_value       NUMERIC(6, 2),
    type_line        VARCHAR(500),
    oracle_text      TEXT,
    power            VARCHAR(20),
    toughness        VARCHAR(20),
    loyalty          VARCHAR(20),
    defense          VARCHAR(20),
    layout           VARCHAR(50),
    image_small      TEXT,
    image_normal     TEXT,
    image_large      TEXT,
    image_png        TEXT,
    image_art_crop   TEXT,
    set_code         VARCHAR(30),
    set_name         VARCHAR(255),
    collector_number VARCHAR(50),
    rarity           VARCHAR(50),
    scryfall_uri     TEXT,
    raw_json         JSONB,
    created_at       TIMESTAMPTZ  NOT NULL DEFAULT NOW(),
    updated_at       TIMESTAMPTZ  NOT NULL DEFAULT NOW()
);