package com.example.demo.controller1;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class welcomeController {
	@RequestMapping("/welcome")
	public String Welcome() {
		return "Welcome String Boot!";
	}
}