package com.vijay.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.vijay.user.entity.User;
import com.vijay.user.repository.UserRepository;
import com.vijay.user.service.vo.Department;
import com.vijay.user.service.vo.ResponseTempleteVo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

	@Autowired
	private UserRepository repository;
	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		log.info("inside saveUser UserService");
		return repository.save(user);
	}

	public ResponseTempleteVo getUserWithDepartment(Long userId) {
		log.info("inside getUserWithDepartment UserService");
		ResponseTempleteVo responseTempleteVo = new ResponseTempleteVo();
		User user = repository.findByUserId(userId);
		Department departmentVo = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + userId,
				Department.class);
		responseTempleteVo.setUser(user);
		responseTempleteVo.setDepartmentVo(departmentVo);
		return responseTempleteVo;
	}
}
