package ru.clmtra.powerchatter.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class MessageRequest {

    @NotNull
    private Long userId;

    @NotBlank
    private String text;
}
