package com.manual.clothing.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Builder
@Table(name = "CUSTOMER")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "id_card", nullable = false)
    private Long idCard;

    @Column(name = "phone", nullable = false)
    private Long phone;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "mail")
    private String mail;

    @Lob
    @Column(name = "gift_code", length = Integer.MAX_VALUE)
    private String[] giftCode;

    @Column(name = "del_flg")
    private Integer delFlg;

    @Column(name = "create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createAt;

    @Column(name = "update_at")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime updateAt;
}
