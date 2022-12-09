package com.example.demo.model;

import com.sun.istack.NotNull;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
@Table(name = "user_account")
@DiscriminatorValue("USER")
public class UserAccountEntity extends AccountEntity {

    @Size(max = 255)
    @NotNull
    private String idmUserId;
}