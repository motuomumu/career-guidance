package edu.swjtuhc.demo.service;


import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.model.Order;
@Service
public interface OrderService {

	int createorder(Order o);
	int updateorder(Order o);
	int deleteorder(Order o);

	

}
