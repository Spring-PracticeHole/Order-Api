package com.memberorderapi.entity;

import com.memberorderapi.entity.global.BaseTimeEntity;
import com.memberorderapi.enumeration.UserRole;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(indexes = {
        @Index(name = "member_email_uindex", columnList = "email", unique = true)
})
public class Member extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_role")
    @Enumerated(value = EnumType.STRING)
    private UserRole userRole;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column
    private String name;

    @Column
    private String tel;


}
