package hello.servlet.web.frontcontroller.v4;

import java.util.Map;

public interface ControllerV4 {
    /**
     * @param paramMap  : 파라미터 저장용 map
     * @param model     : 객체 저장용 map
     * @return  : viewName
     */
    String process(Map<String, String> paramMap, Map<String, Object> model);
}
