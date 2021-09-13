package ru.clmtra.powerchatter.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "messages")
public class Message {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "text")
    private String text;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
