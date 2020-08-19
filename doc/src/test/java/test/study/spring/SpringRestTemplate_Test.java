package test.study.spring;

import com.google.common.collect.Maps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-context.xml")
public class SpringRestTemplate_Test {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringRestTemplate_Test.class);

    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void test_() {
        Map<String, Object> params = Maps.newHashMap();
        params.put("name", "wangzhj");
        params.put("age", 35);
        Map<String, Object> result = restTemplate.postForObject("http://localhost:9090/rest_template", params, Map.class);
//        restTemplate.getForObject("http://localhost:9090/say_hi", Map.class);
        System.out.println(result);
    }
}
