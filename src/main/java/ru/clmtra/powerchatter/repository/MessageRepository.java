package ru.clmtra.powerchatter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.clmtra.powerchatter.model.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

}
