package in.xiaocao;

import net.spy.memcached.MemcachedClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import in.xiaocao.config.MemcachedRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RepositoryTests {

	@Resource
    private MemcachedRunner memcachedRunner;

	@Test
	public void testSetGet() {
		MemcachedClient memcachedClient = memcachedRunner.getClient();
		memcachedClient.set("name", 1000, "xiaocao");
		System.out.println("get by key : " + memcachedClient.get("name").toString());
	}

}