package study.spring.web.action;

import com.google.common.collect.Maps;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import study.spring.support.action.BaseAction;
import study.spring.support.context.RequestContext;
import study.spring.support.web.Param;
import study.spring.support.web.Results;

import java.util.Map;

@Component
public class Action_demo_say_hi extends BaseAction{

    public Action_demo_say_hi(){
        LOGGER.info("===>111111111111111Action_demo_say_hi");
    }

    protected Map<String, Object> processBusiness(RequestContext cxt, Param param) {

//        RedisClient.set("mykey", "valuesdfsdflljsafdl");
//        if("".equals("")){
//            throw new IllegalArgumentException("ssssssssss");
//        }
        Map<String, Object> data = Maps.newHashMap();
        data.put("ub_id", 666666);
        data.put("access_token", "0123456789");
        data.put("times", "2018");

        cxt.getRequest().getCookies();
        return data;
    }
}
