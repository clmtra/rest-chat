package ru.clmtra.powerchatter.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.clmtra.powerchatter.dto.MessageRequest;
import ru.clmtra.powerchatter.dto.MessageResponse;
import ru.clmtra.powerchatter.model.Message;

@Mapper(componentModel = "spring")
public interface MessageMapper {

    @Mapping(target = "user.id", source = "userId")
    Message map(MessageRequest messageRequest);

    @Mapping(target = "author", source = "user.name")
    MessageResponse map(Message message);
}
