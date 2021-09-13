package ru.clmtra.powerchatter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.clmtra.powerchatter.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
