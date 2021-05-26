package hello.servlet.web.frontcontroller;

import java.util.HashMap;
import java.util.Map;

/**
 * viewName,
 * view rendering시 필요한 데이터를 저장하고 있는 객체를 저장할 map
 * */
public class ModelView {
    private String viewName;

    private Map<String, Object> model = new HashMap<>();

    public ModelView(String viewName) {
        this.viewName = viewName;
    }
    public String getViewName() {
        return viewName;
    }
    public void setViewName(String viewName) {
        this.viewName = viewName;
    }
    public Map<String, Object> getModel() {
        return model;
    }
    public void setModel(Map<String, Object> model) {
        this.model = model;
    }
}
