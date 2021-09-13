package ru.clmtra.powerchatter.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class UserSignRequest {

    @NotBlank
    @Size(min = 1, max = 20)
    @Pattern(regexp = "^[A-Za-z0-9_]*$")
    private String username;
}
