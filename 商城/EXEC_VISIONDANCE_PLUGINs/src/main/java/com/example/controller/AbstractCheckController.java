package com.example.controller;
import com.example.service.*;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
abstract public class AbstractCheckController//用用响应前台查看积分记录的抽象控制器
{
	abstract public ReturnData[] records(long userid);//返回对应用户id积分记录的函数
}
