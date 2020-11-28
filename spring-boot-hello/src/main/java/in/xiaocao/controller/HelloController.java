package in.xiaocao.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.xiaocao.dto.Cat;

@RestController
public class HelloController {
	
	@Autowired
	private List<Cat> cats;
	
    @RequestMapping("/")
    public String index() {
        return "Hello Spring Boot 2.0!";
    }
    
    @RequestMapping("/cats")
    public List<Cat> cats() {
    	return new ArrayList<Cat>(cats);
    }
    
}