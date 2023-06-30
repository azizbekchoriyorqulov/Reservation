package com.example.reservation.entity;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class BookingRequestEntity extends BaseEntity{
public UUID userId;
public UUID RoomId;
public double price;
public Date beginDate;
public Date endDate;
}
