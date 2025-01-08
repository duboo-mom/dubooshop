package com.myshop.dubooshop.entity;

import com.myshop.dubooshop.constant.ItemSellStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;

@Entity
@Table(name="item")
@Getter
@Setter
@ResponseBody
@ToString
public class Item {

    @Id
    @Column(name="item_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; //상품 코드

    @Column(name="item_name",nullable = false, length = 60)
    private String itemName; //상품명

    @Column(name="price",nullable = false)
    private int price; //가격

    @Column(nullable = false)
    private int stock; //수량

    @Lob
    @Column(nullable = false)
    private String itemDetail;

    @Enumerated(EnumType.STRING)
    private ItemSellStatus itemSellStatus;

    private LocalDate regDate;

    private LocalDate updateDate;


}
