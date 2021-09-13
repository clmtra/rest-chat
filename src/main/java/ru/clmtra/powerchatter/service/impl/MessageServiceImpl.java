package ru.clmtra.powerchatter.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.orm.jpa.JpaObjectRetrievalFailureException;
import org.springframework.stereotype.Service;
import ru.clmtra.powerchatter.exception.UserNotFoundException;
import ru.clmtra.powerchatter.model.Message;
import ru.clmtra.powerchatter.repository.MessageRepository;
import ru.clmtra.powerchatter.service.MessageService;

import java.util.Collections;
import java.util.List;


@Service
@RequiredArgsConstructor
public class MessageServiceImpl implements MessageService {

    private final MessageRepository messageRepository;

    @Override
    public void saveMessage(Message message) {
        try {
            messageRepository.save(message);
        } catch (JpaObjectRetrievalFailureException ex) {
            throw new UserNotFoundException(ex.getMessage());
        }
    }

    @Override
    public List<Message> getAllMessages() {
        var messages = messageRepository.findAll();
        Collections.reverse(messages);

        return messages;
    }
}
