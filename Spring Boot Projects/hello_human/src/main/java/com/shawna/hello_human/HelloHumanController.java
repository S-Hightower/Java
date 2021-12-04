package com.shawna.hello_human;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping
public class HelloHumanController {
	@RequestMapping("/")
    public String index(@RequestParam(value="name", required=false) String searchQuery) {
		if(searchQuery == null){
			return "Hello Human";
		}else {
			return "Hello " +searchQuery;
		}
	}
}
