package ru.clmtra.powerchatter.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.clmtra.powerchatter.model.User;
import ru.clmtra.powerchatter.repository.UserRepository;
import ru.clmtra.powerchatter.service.UserService;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User signInUser(User user) {

        return userRepository.save(user);
    }
}
