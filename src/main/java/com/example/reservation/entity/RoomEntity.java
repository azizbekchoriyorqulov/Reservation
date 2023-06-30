package com.example.reservation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity(name = "room")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RoomEntity extends BaseEntity{
public String number;
public int size;
public double price;
public Boolean hasMonitor;
@ManyToOne
public RoomType type;
}
