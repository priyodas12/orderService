package com.routeMobile.controller;

import com.routeMobile.model.Order;
import com.routeMobile.service.OrderService;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import io.netty.util.internal.ObjectUtil;
import jakarta.validation.Valid;
import java.util.List;

@Controller("/api/v1")
public class OrderController {

  private final OrderService orderService;

  public OrderController(OrderService orderService) {
    this.orderService = orderService;
  }

  @Get(value = "/orders/{orderId}")
  public HttpResponse<Order> getOrder(@PathVariable @Valid String orderId) {
    var response = orderService.getOrderByOrderId(Long.parseLong(orderId));
    if(response == null) {
      return HttpResponse.notFound();
    }
    return HttpResponse.ok(response);
  }

  @Get("/orders")
  public HttpResponse<List<Order>> getOrders() {
    return HttpResponse.ok(orderService.getAllOrders());
  }

  @Post("/orders")
  public HttpResponse<Order> createOrder(@Body @Valid Order order) {
    return HttpResponse.created(orderService.addOrder(order));
  }

  @Put("/orders")
  public HttpResponse<Order> updateOrder(@Body @Valid Order order) {
    if(order.getOrderId()==null){
      return HttpResponse.badRequest();
    }
    return HttpResponse.ok(orderService.updateOrder(order));
  }

  @Delete("/orders/{orderId}")
  public HttpResponse<Long> createOrder(String orderId) {
    return HttpResponse.ok(orderService.deleteOrder(Long.parseLong(orderId)));
  }
}
