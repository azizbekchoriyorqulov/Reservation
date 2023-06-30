package com.example.reservation.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class RoomEntity extends BaseEntity{
    public String number;
    public int size;
    public Double price;
    public RoomType type;
    public Boolean hasMonitor;
}
