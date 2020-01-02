package edu.swjtuhc.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.model.Orphanage;

@Service
public interface OrphanageService {

	public List<Orphanage> getList();
}
