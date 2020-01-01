package edu.swjtuhc.demo.service;

import edu.swjtuhc.demo.model.Time;

//接口
public interface TimeService {
	Long getNextId();
	int createtime(Time t);
}
