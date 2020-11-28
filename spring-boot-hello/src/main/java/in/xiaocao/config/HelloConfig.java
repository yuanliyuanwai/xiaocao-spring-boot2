package in.xiaocao.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.xiaocao.dto.Cat;
import in.xiaocao.dto.Mouse;

@Configuration
public class HelloConfig {
	
	@Bean
	public Cat cat1() {
		return new Cat("Tom1", 5, mouse("Jack1"));
	}
	
	@Bean
	public Cat cat2() {
		// 返回的mouse也只是Jack1
		// 要返回Jack2需要mouse1和mouse2
		return new Cat("Tom2", 5, mouse("Jack2"));
	}
	
	@Bean
	public Mouse mouse(String name) {
		// cat依赖mouse,mouse依赖string类型的name
		// mouse的bean只会初始化一次,只能放在cat后面由cat将name传递过来
		System.out.println("create mouse " + name);
		return new Mouse(name);
	}

}
