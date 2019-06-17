package study.spring.mvc.support.context;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.HandlerMapping;

import java.util.Map;

/**
 * Spring上下文
 *
 * @author wangzhj
 */
public class SpringContext implements ApplicationContextAware {

    /* 应用上下文 */
    private static WebApplicationContext CTX;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        CTX = (WebApplicationContext) applicationContext;
    }

    /**
     * 获取Bean
     */
    public static <T> T getBean(String name) {
        T bean = (T) CTX.getBean(name);
        return bean;
    }

    public static <T> T getBean(Class<T> clazz) {
        T bean = (T) CTX.getBean(clazz);
        return bean;
    }

    public static <T> T getBean(String name, Class<T> clazz) {
        T bean = (T) CTX.getBean(name, clazz);
        return bean;
    }

    public static <T> String[] getBeanNamesForType(Class<T> clazz) {
        return CTX.getBeanNamesForType(clazz);
    }

    public static Map<String, HandlerMapping> getBeansOfType(Class<HandlerMapping> clazz) {
        Map<String, HandlerMapping> matchingBeans =
                BeanFactoryUtils.beansOfTypeIncludingAncestors(CTX, HandlerMapping.class, true, false);
//        return CTX.getBeansOfType(clazz);
        return matchingBeans;
    }

    /**
     * 是否存在Bean
     */
    public static boolean containsBean(String name) {
        return CTX.containsBean(name);
    }

    public static boolean containsBean(Class<?> clazz) {
        boolean isExist = false;
        if (CTX.getBean(clazz) != null) {
            isExist = true;
        }
        return isExist;
    }
}
