package com.config.server.consumer.project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class TestController {
	@GetMapping("/getServer")
	public String getServer() {
		return " This Is Server";
	}
}
