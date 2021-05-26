package hello.servlet.web.frontcontroller.v5;

import hello.servlet.web.frontcontroller.ModelView;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *  어댑터를 사용해서, 다른 종류의 컨트롤러를 호출할 수 있다.
 *  supports(Object handler)에서 handler는 컨트롤러를 말한다.
 *  handle()에서는 실제 컨트롤러를 호출하고, 그 결과로 viewName과 객체를 갖고 있는 ModelView를 반환한다.
 *
 *  이전에는 FC가 컨트롤러를 반환했지만, 지금은 FC가 adapter를, adapter가 controller를 호출.
 * */
public interface MyHandlerAdapter {
    boolean supports(Object handler);

    ModelView handle(HttpServletRequest request, HttpServletResponse response, Object handler) throws ServletException, IOException;
}
