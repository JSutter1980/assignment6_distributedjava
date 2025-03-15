package edu.wctc.wholesale.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "wholesale_order")
public class WholesaleOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private long id;

    @Column(name = "purchase_order_num")
    private String purchaseOrderNum;

    @Column(name = "terms")
    private String terms;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "purchase_date")
    private LocalDateTime purchaseDate;

    @Column(name = "shipped_date")
    private LocalDateTime shippedDate;
}
