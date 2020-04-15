package com.yjf;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WelcomeController {


    @RequestMapping(value = "/index")
    public void index() {
        MyWebSocket.pushMessage("群主", "你们好", null);
    }
}
