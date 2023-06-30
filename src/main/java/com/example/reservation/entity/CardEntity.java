package com.example.reservation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.time.LocalDateTime;

@Entity(name = "card")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CardEntity  extends BaseEntity
{
    public String number;
    public LocalDateTime expiredDate;
    @ManyToOne
    public CardType type;
}
