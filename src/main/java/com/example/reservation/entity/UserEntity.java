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
public class UserEntity extends BaseEntity {
    public String name;
    public String email;
    public String password;
    public int age;
    public int unpaidReqs;
    public int canceledReqs;
    public UserRoll roll;

}
