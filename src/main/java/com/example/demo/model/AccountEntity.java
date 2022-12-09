package com.example.demo.model;

import com.sun.istack.NotNull;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "account")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING, length = 255)
public class AccountEntity extends ModelEntity {

    @NotNull
    @Column(length = 40/*, updatable = false*/)
    private String uuid;

    private String name;

    private String accountType;

    private String description;
}
