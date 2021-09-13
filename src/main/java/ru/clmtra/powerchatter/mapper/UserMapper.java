package ru.clmtra.powerchatter.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.clmtra.powerchatter.dto.UserSignRequest;
import ru.clmtra.powerchatter.dto.UserSignResponse;
import ru.clmtra.powerchatter.model.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "name", source = "username")
    User map(UserSignRequest userSignRequest);

    UserSignResponse map(User user);
}
