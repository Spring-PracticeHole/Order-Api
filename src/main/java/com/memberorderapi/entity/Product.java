package com.memberorderapi.entity;

import com.memberorderapi.entity.global.BaseTimeEntity;
import com.memberorderapi.enumeration.ProductStatus;
import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
public class Product extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "price", nullable = false)
    private Integer price;

    @Column(name = "status")
    @Enumerated(value = EnumType.STRING)
    private ProductStatus status;

}
