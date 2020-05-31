package in.xiaocao.web;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import in.xiaocao.util.ConfigProperties;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProPertiesTest {

	@Autowired
    private ConfigProperties configProperties;

    @Test
    public void getHello() throws Exception {
    	System.out.println(configProperties.getTitle());
        Assert.assertEquals(configProperties.getTitle(), "猿里猿外");
        Assert.assertEquals(configProperties.getDescription(), "簡單生活");
    }

}