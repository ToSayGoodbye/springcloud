package com.hhf.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hhf.bean.Dept;

@FeignClient(value = "MICROSERVICECLOUD-DEPT") //向哪个微服务进行面向接口feign的编码
public interface DeptClientService {
	
	@RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
	public Dept get(@PathVariable("id") long id);

	@RequestMapping(value = "/dept/list",method = RequestMethod.GET)
	public List<Dept> list();


	@RequestMapping(value = "/dept/add",method = RequestMethod.POST)
	public boolean add(Dept dept);

}
