package br.com.drawkeep.adapter.in.dto;

import lombok.Builder;

import java.util.UUID;

@Builder
public record CardResponse(UUID cardId, UUID oracleId, String name) {}
