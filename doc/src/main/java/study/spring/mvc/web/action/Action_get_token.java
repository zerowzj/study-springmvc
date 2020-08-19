package study.spring.mvc.web.action;

import org.springframework.stereotype.Component;
import study.spring.mvc.support.action.BaseAction;
import study.spring.mvc.support.context.RequestContext;
import study.spring.mvc.support.Param;
import study.spring.mvc.support.Results;

import java.util.Map;

@Component
public class Action_get_token extends BaseAction{

    @Override
    protected Map<String, Object> processBusiness(RequestContext cxt, Param param) {

//        RedisClient.set("mykey", "valuesdfsdflljsafdl");
//        if("".equals("")){
//            throw new IllegalArgumentException("ssssssssss");
//        }
        Map<String, Object> data = Results.data();
        data.put("ub_id", 666666);
        data.put("access_token", "0123456789");
        data.put("times", "2018");

        cxt.getRequest().getCookies();
        return data;
    }
}
