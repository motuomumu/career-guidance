package edu.swjtuhc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.mapper.OrphanageMapper;
import edu.swjtuhc.demo.model.Orphanage;
import edu.swjtuhc.demo.service.OrphanageService;


@RestController
@RequestMapping("/orphanage")
public class OrphanageController {

	@Autowired
	OrphanageService OrphanageService;
	
	@RequestMapping(value = "/getlist",method=RequestMethod.GET)
	public List<Orphanage> getList(){
		
		return OrphanageService.getList();
	}
}
