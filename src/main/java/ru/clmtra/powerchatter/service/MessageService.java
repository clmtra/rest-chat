package ru.clmtra.powerchatter.service;

import ru.clmtra.powerchatter.model.Message;

import java.util.List;

public interface MessageService {
    void saveMessage(Message message);

    List<Message> getAllMessages();
}
