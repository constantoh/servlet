package hello.servlet.web.frontcontroller.v3;

import hello.servlet.web.frontcontroller.ModelView;
import java.util.Map;

/**
 * ControllerV2과 다른점은 HttpServletRequest, HttpServletResponse를 사용하지 않는다.
 * 클라이언트에서 받은 파라미터를 Front Controller가 paramMap에 담아 함께 호출한다.
 * */
public interface ControllerV3 {
    ModelView process(Map<String, String> paramMap);
}
