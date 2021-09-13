package ru.clmtra.powerchatter.controller.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.clmtra.powerchatter.controller.MessageController;
import ru.clmtra.powerchatter.dto.MessageRequest;
import ru.clmtra.powerchatter.dto.MessageResponse;
import ru.clmtra.powerchatter.mapper.MessageMapper;
import ru.clmtra.powerchatter.service.MessageService;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class MessageControllerImpl implements MessageController {

    private final MessageService messageService;
    private final MessageMapper messageMapper;

    @Override
    @PostMapping("/messages")
    @ResponseStatus(HttpStatus.CREATED)
    public void sendMessage(@RequestBody @Valid MessageRequest messageRequest) {
        var message = messageMapper.map(messageRequest);
        messageService.saveMessage(message);
    }

    @Override
    @GetMapping("/messages")
    @ResponseStatus(HttpStatus.OK)
    public List<MessageResponse> getAllMessages() {

        return messageService.getAllMessages().stream()
                .map(messageMapper::map)
                .collect(Collectors.toList());
    }
}
