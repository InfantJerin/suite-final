package com.crm.domain;

import java.math.BigDecimal;

public record PurchaseOrder(String orderId, BigDecimal amount) {}
