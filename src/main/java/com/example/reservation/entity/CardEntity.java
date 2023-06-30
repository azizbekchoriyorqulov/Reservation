package com.example.reservation.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class CardEntity extends BaseEntity{
    public String number;
    public double balance;
    public LocalDateTime expiryDate;
    public UUID ownerId;
    public CardType type;
}
