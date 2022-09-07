package com.devsuperior.dsmeta.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_sales")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "seller_name")
    private String sellerName;

    @Column(name = "visited")
    private Integer visitedNumber;
    private Integer deals;
    private Double amount;
    private LocalDateTime date;

    public Sale() {
    }

    public Sale(Long id, String sellerName, Integer visitedNumber, Integer deals, Double amount, LocalDateTime date) {
        this.id = id;
        this.sellerName = sellerName;
        this.visitedNumber = visitedNumber;
        this.deals = deals;
        this.amount = amount;
        this.date = date;
    }
}
