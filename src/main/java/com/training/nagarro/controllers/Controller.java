package com.training.nagarro.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping("/message")
	public Map<String,Object> message()
	{
		Map<String,Object> data=new HashMap<>();
		data.put("message", "REST API Endpoint Working Succesfully");
		data.put("success", true);
		data.put("status", HttpStatus.OK);
		return data;
	}
}
