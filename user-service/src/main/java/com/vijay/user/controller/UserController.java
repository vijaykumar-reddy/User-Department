package com.vijay.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.user.entity.User;
import com.vijay.user.service.UserService;
import com.vijay.user.service.vo.ResponseTempleteVo;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/save")
	public User saveUser(@RequestBody User user) {
		log.info("inside saveUser UserController");
		return service.saveUser(user);
	}

	@GetMapping("/{id}")
	public ResponseTempleteVo getUserWithDepartment(@PathVariable("id") Long userId) {
		log.info("inside getUserWithDepartment UserController");
		return service.getUserWithDepartment(userId);

	}
}
