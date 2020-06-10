package com.example.controller;
import com.example.service.*;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CheckController extends AbstractCheckController//查看积分记录
{
	@GetMapping("/records")
	/*
	 * 下面这个是预计的url格式，可以随意设计
	 * prefix/records?userid=xxxxx
	 */
	public ReturnData[] records(@RequestParam(value = "userid", defaultValue = "tourist")long userid)
	{
		Services s=new Service();//里氏替换原则生成服务类
		GetDataOrders data=new GetDataOrders(userid);//一个用于记录在查询积分记录时来自前台的数据的数据结构
		return s.mes(data);//向服务层传入前台的数据，将所有的积分记录返回
	}
}
