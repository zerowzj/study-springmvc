package study.spring.mvc.support;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * 结果
 *
 * @author wangzhj
 */
public abstract class Results {

    private static final String KEY_CODE = "code";

    private static final String KEY_DESC = "desc";

    private static final String KEY_DATA = "data";

    private static final String KEY_REQUEST_ID = "request_id";

    /**
     * 成功
     */
    public static Map<String, Object> ok(Map<String, Object> data) {
        return build("0000", "成功", data);
    }

    /**
     * 失败
     */
    public static Map<String, Object> fail(String code, String desc) {
        return build(code, desc, null);
    }

    /**
     * 错误
     */
    public static Map<String, Object> error() {
        return build("9999", "系统异常", null);
    }

    private static Map<String, Object> build(String code, String desc, Map<String, Object> data) {
        Map<String, Object> result = Maps.newHashMap();
        result.put(KEY_CODE, code);
        result.put(KEY_DESC, desc);
        if (data == null) {
            data = Maps.newHashMap();
        }
        result.put(KEY_DATA, data);
        //result.put(KEY_REQUEST_ID, TrackKeys.get());
        return result;
    }

    public static Map<String, Object> data(){
        return Maps.newHashMap();
    }
}
