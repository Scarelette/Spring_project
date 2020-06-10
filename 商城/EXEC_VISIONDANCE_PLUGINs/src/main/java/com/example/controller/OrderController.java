package com.example.controller;
import com.example.service.*;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
public class OrderController extends AbstractOrderController//订单产生时进行积分计算
{
	@GetMapping("/order")
	/*
	 * prefix/order?userid=xxxxx and goodid=xxxx
	 */
	public ReturnData order(@RequestParam(value = "userid", defaultValue = "tourist")long userid,
			@RequestParam(value = "goodid", defaultValue = "good")long goodid)
	{
		Services s=new Service();//服务类
		GetDataOrder data=new GetDataOrder(userid,goodid);//设置接收的数据结构
		ReturnData tmp=new ReturnData();//新建返回统一数据类型
		tmp.setUserid(userid);//设置有效字段
		tmp.setNum(s.sub(data));//设置有效字段
		return tmp;//返回统一数据类型
	}
}
