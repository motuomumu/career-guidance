package edu.swjtuhc.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.OrphanageMapper;
import edu.swjtuhc.demo.model.Orphanage;
import edu.swjtuhc.demo.service.OrphanageService;

@Service
public class OrphanageServiceImpl implements OrphanageService{

	@Autowired
	OrphanageMapper orphanageMapper;
	@Override
	public List<Orphanage> getList() {
		// TODO Auto-generated method stub
		return orphanageMapper.selectAllOrphanage();
	}

}
