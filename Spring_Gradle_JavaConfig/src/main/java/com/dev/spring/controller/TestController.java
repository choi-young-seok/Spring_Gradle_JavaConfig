package com.dev.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class TestController {

	final Logger log = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index2() {
		log.info("Request /index");
		return "index";
	}
}
