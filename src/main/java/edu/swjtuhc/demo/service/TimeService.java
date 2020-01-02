package edu.swjtuhc.demo.service;

import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.model.Time;

//接口
@Service
public interface TimeService {
	Long getNextId();
	int createtime(Time t);
}
