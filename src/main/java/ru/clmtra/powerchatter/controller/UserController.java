package ru.clmtra.powerchatter.controller;

import ru.clmtra.powerchatter.dto.UserSignRequest;
import ru.clmtra.powerchatter.dto.UserSignResponse;

public interface UserController {

    UserSignResponse signInUserAndGetId(UserSignRequest userSignRequest);
}
