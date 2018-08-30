package com.hhf.springcloud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hhf.bean.Dept;
import com.hhf.springcloud.dao.DeptDao;

@Service
public class DeptServiceimpl implements DeptService {

	@Autowired
	private DeptDao dao;
	
	@Override
	public boolean add(Dept dept) {
		 return dao.addDept(dept);
	}

	@Override
	public Dept get(Long id) {
		  return dao.findById(id);
	}

	@Override
	public List<Dept> list() {
		return dao.findAll();
	}

}
