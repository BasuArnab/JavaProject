package com.manipal.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SupplyChainApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupplyChainApplication.class, args);
	}

  @GetMapping("/test")
	@ResponseBody
	public String test() {
		return "hello World";
	}
}
