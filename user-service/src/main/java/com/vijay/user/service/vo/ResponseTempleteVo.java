package com.vijay.user.service.vo;

import com.vijay.user.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTempleteVo {
	private User user;
	private Department departmentVo;
}
