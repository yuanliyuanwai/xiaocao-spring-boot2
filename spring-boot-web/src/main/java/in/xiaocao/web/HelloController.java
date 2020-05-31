package in.xiaocao.web;

import java.util.Locale;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.xiaocao.model.User;
import in.xiaocao.util.ConfigProperties;

@RestController
public class HelloController {
	
	@Autowired
	private ConfigProperties configProperties;
	
    @RequestMapping("/hello")
	public String hello(Locale locale, Model model) {
		return "Hello World";
	}
    
    @RequestMapping("/config")
   	public String config(Locale locale, Model model) {
   		return configProperties.getTitle() + "/" + configProperties.getDescription();
   	}

}