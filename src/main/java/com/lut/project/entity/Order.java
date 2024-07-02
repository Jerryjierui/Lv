package com.lut.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private int orderId;
    private String bookName;
    private int quantity;
    private int price;
    private int totalPrice;
    private int buyerId;
    private String buyerName;
    private String buyerPhone;
    private String buyerAddress;
}
