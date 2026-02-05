package com.example.db_test.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="member_test")
public class MemberEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long number;

    @Column(unique = true, name="user_id", nullable = false, length = 30)
    private String userId;

    private String userName;
    private int age;
}
