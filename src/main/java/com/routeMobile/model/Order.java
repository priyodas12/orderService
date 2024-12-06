package com.routeMobile.model;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.GeneratedValue.Type;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.annotation.sql.JoinTable;
import io.micronaut.serde.annotation.Serdeable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

@Serdeable
@MappedEntity(value = "orders")
public class Order {

  @Id
  @GeneratedValue(Type.IDENTITY)
  private Long orderId;
  private UUID orderBarcode;
  private String orderStatus;
  private BigDecimal orderPrice;

  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public UUID getOrderBarcode() {
    return orderBarcode;
  }

  public void setOrderBarcode(UUID orderBarcode) {
    this.orderBarcode = orderBarcode;
  }

  public String getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }

  public BigDecimal getOrderPrice() {
    return orderPrice;
  }

  public void setOrderPrice(BigDecimal orderPrice) {
    this.orderPrice = orderPrice;
  }
}