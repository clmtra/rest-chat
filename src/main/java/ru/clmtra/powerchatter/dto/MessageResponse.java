package ru.clmtra.powerchatter.dto;

import lombok.Data;

@Data
public class MessageResponse {

    private String author;

    private String text;
}
