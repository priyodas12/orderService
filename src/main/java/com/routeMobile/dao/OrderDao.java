package com.routeMobile.dao;


import com.routeMobile.model.Order;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;

@JdbcRepository(dialect = Dialect.POSTGRES)
public interface  OrderDao extends CrudRepository<Order, Long> {


}
