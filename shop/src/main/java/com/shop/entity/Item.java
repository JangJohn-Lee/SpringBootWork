package com.shop.entity;

import com.shop.constant.ItemSellStatus;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name="item")
@Entity
@Getter
@Setter
@ToString
public class Item extends BaseEntity{

    @Id
    @Column(name="item_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;                         //상품코드

    @Column(nullable=false, length = 50)
    private String itemNm;                   //상품명

    @Column(name="price",nullable=false)
    private int price;                       //가격

    @Column(nullable=false)
    private int stockNumber;                 //재고수량

    @Lob
    @Column(nullable = false)
    private String itemDetail;               //상품 상세 설명

    @Enumerated(EnumType.STRING)
    private ItemSellStatus itemSellStatus;   //상품 판매 상태

//    private LocalDateTime regTime;           //등록 시간
//
//    private LocalDateTime updateTime;        //수정시간
    // BaseEntity를 extends 받아 Auditing을 하여 등록시간및 수정시간을 입력해줄수 있으므로
    // 해당 필드값은 없어도됨
}
