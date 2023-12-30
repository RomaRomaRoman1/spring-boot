package controller;

import model.RequestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Component;
@RestController
@RequestMapping("/")
public class ControllerForRequest {

    private final RequestBean requestBean;

    public ControllerForRequest(RequestBean requestBean) {
        this.requestBean = requestBean;
    }

    @GetMapping("/u")
    public String Fr() {
        StringBuilder b = new StringBuilder();
        b.append("CFR!\n\n");
        b.append("First call of the request scoped bean: \n");
        b.append(requestBean.toString());
        b.append("\n\n");
        b.append(requestBean.toString());
        return b.toString();
    }
}
