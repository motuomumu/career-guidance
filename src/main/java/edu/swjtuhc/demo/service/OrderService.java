package edu.swjtuhc.demo.service;

import edu.swjtuhc.demo.model.Order;

public interface OrderService {

	int createorder(Order o);
	int updateorder(Order o);
	int deleteorder(Order o);

	

}
