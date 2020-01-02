package edu.swjtuhc.demo.serviceimpl;


import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.TimeMapper;
import edu.swjtuhc.demo.model.Time;
import edu.swjtuhc.demo.service.TimeService;
@Service
public class TimeServiceImpl implements TimeService {
	
	private TimeMapper TimeMapper;
	
	public int createtime(Time t) {
		//TODO Auto-generated method stub
		if(t.getStarttime()==null||t.getEndtime().length()<1) {
			return -1;
		}else {
			t.settId(getNextId());
		}
		return TimeMapper.createTime(t);
	}

	@Override
	public Long getNextId() {
		// TODO Auto-generated method stub
		return null;
	}
}
