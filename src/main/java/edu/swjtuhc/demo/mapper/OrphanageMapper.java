package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Orphanage;

@Mapper
public interface OrphanageMapper {

	public List<Orphanage> selectAllOrphanage();
}
