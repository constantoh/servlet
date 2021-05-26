package hello.servlet.web.frontcontroller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * 각 Controller마다 viewPath를 설정하고, 이를 dispatcher를 이용해서 forward했다.
 *  -> 이를 MyView에서 공통화한다.
 *
 * */
public class MyView {
    private String viewPath;

    public MyView(String viewPath) {
        this.viewPath = viewPath;
    }

    //viewPath로 이동하여 렌더링한다는 의미
    public void render(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
        dispatcher.forward(request, response);
    }
    // 모든 객체는 Model에 담겨있다. jsp는 request객체를 통해 데이터를 접근하기에 객체들을 request에 넣는 작업을 한다.
    public void render(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /**
         * jsp는 객체를 request에서 조회하기 때문에 request에 넣는 작업.
         * */
        modelToRequestAttribute(model, request);

        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
        dispatcher.forward(request, response);
    }
    private void modelToRequestAttribute(Map<String, Object> model, HttpServletRequest request) {
        model.forEach((key, value) -> request.setAttribute(key, value));
    }
}
