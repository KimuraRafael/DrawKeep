package br.com.drawkeep.adapter.in.card;

import lombok.Builder;

import java.util.UUID;

@Builder
public record CardResponse(UUID cardId, UUID oracleId, String name) {}
