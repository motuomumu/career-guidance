package edu.swjtuhc.demo.service;

import edu.swjtuhc.demo.model.Time;

public interface TimeService {
	Long getNextId();
	int createtime(Time t);
}
