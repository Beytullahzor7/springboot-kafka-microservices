package com.basedomains.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEvent {
    // we're gonna use to transfer the data between producer and consumer using apache kafka

    private String message;
    private String status;
    private Order order;
}
