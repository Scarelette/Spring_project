package com.example.dao;

import org.springframework.data.repository.CrudRepository;
public interface UserTolcreRop extends CrudRepository<UserTolcre,Long>
{
	UserTolcre findByUserId(long userid);
}
