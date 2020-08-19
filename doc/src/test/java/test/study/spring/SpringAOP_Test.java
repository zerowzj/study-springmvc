package test.study.spring;

import com.google.common.primitives.Floats;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-context.xml")
public class SpringAOP_Test {

    @Test
    public void test() {
        String str = "1.0";
        System.out.println(Floats.tryParse(str.toString()));
    }
}
