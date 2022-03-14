package com.womakerscode.bootcampjava.customerwomakerscode.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)

public class OrderResponse {


    private String uuid;
    private String sellerId;
    private String customerId;
    private Long amount;
}
