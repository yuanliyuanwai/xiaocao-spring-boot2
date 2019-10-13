package in.xiaocao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("in.xiaocao.mapper")
public class MybatisXmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisXmlApplication.class, args);
	}
}
