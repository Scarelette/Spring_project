package com.example.dao;
import org.springframework.data.repository.CrudRepository;
public interface GoodPriRop extends CrudRepository<GoodPri,Long>
{
	GoodPri findByGoodId(long goodid);
}
