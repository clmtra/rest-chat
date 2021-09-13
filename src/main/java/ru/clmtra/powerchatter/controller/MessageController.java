package ru.clmtra.powerchatter.controller;

import ru.clmtra.powerchatter.dto.MessageRequest;
import ru.clmtra.powerchatter.dto.MessageResponse;

import java.util.List;

public interface MessageController {

    void sendMessage(MessageRequest message);

    List<MessageResponse> getAllMessages();
}
