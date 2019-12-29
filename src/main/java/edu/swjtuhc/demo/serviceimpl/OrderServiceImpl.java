package edu.swjtuhc.demo.serviceimpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import edu.swjtuhc.demo.mapper.OrderMapper;
import edu.swjtuhc.demo.model.Order;

public class OrderServiceImpl {
	
	private OrderMapper OrderMapper;
	
	@Autowired
	public OrderServiceImpl(
			OrderMapper orderMapper
			) {
		this.OrderMapper=orderMapper;
		//TODO Auto-generated constructor stub
		
	}
	public int createorder(Order o) {
		// TODO Auto-generated method stub
		Order i=OrderMapper.getOrder(o.getOrder());
		if (i!=null&&i.getoId()!=null&&i.getoId()>0) {
			return 1;
		}else if (i.getOrder()==null||i.getOrder().length()<1) {
			return 0;
		}
		return OrderMapper.createOrder(o);
	}
	
	public int updateOrder(Order o) {
		// TODO Auto-generated method stub
		OrderMapper.getOrder(o.getOrder());
		if (o.getOrder()==null||o.getOrder().length()<1) {
			return 1;
		}else if (o.getSubmitname()==null||o.getSubmitname().length()<1) {
			return 1;
		}else {
			o.setSubmitData(new Date());
		}
		return OrderMapper.updateOrder(o);
	}
	public int deleteOrder(Order o) {
		// TODO Auto-generated method stub
		if(o.getoId()==null) {
			return 1;
		}else {
			return OrderMapper.deleteOrder(o);
		}
	}
}
