package ru.clmtra.powerchatter.controller.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import ru.clmtra.powerchatter.controller.UserController;
import ru.clmtra.powerchatter.dto.UserSignRequest;
import ru.clmtra.powerchatter.dto.UserSignResponse;
import ru.clmtra.powerchatter.mapper.UserMapper;
import ru.clmtra.powerchatter.service.UserService;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class UserControllerImpl implements UserController {

    private final UserService userService;
    private final UserMapper userMapper;

    @Override
    @PostMapping("/signin")
    @ResponseStatus(HttpStatus.CREATED)
    public UserSignResponse signInUserAndGetId(@RequestBody @Validated UserSignRequest userSignRequest) {

        return Optional.of(userSignRequest)
                .map(userMapper::map)
                .map(userService::signInUser)
                .map(userMapper::map)
                .orElseThrow(RuntimeException::new);
    }
}
