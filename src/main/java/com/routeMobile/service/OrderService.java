package com.routeMobile.service;

import com.routeMobile.dao.OrderDao;
import com.routeMobile.model.Order;
import jakarta.inject.Singleton;
import java.math.BigInteger;
import java.util.List;

@Singleton
public class OrderService {

  private final OrderDao orderDao;

  public OrderService(OrderDao orderDao) {
    this.orderDao = orderDao;
  }

  public Order getOrderByOrderId(Long orderId) {
    return orderDao.findById(orderId).orElse(null);
  }

  public List<Order> getAllOrders() {
    return orderDao.findAll();
  }

  public Order addOrder(Order order) {
    return orderDao.save(order);
  }

  public Order updateOrder(Order order) {
    return orderDao.update(order);
  }

  public Long deleteOrder(Long orderId) {
    orderDao.deleteById(orderId);
    return orderId;
  }
}
