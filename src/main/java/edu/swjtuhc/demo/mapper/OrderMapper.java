package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Order;

@Mapper
public interface OrderMapper {

	Order getOrder(String order);
	Integer createOrder(Order order);
	Integer updateOrder(Order order);
	Integer deleteOrder(Order order);
}
