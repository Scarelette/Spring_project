package com.example.dao;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
public interface GoodCreRop extends CrudRepository<GoodCre,Long>
{
	GoodCre findByGoodId(long goodid);
}
