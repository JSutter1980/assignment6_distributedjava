package edu.wctc.wholesale.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class WholesaleOrder {
    private long orderId;
    private long purchaseOrderId;
    private String purchaseOrderNum;
    private String orderStatus;
    private String orderType;
    private String orderDate;
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    private String customerAddress;
    private String customerZip;
    private String customerCity;
    private String customerState;
    private String customerCountry;
    private String customerZipCode;
    private String customerPostalCode;
    private String customerCountryCode;
}
