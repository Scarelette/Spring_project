package com.example.dao;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
public interface CreRecordRop extends CrudRepository<CreRecord,Long>
{
	List<CreRecord> findByUserId(long userid);
}
