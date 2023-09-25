package kr.easw.lesson01.controller.web;

import kr.easw.lesson01.service.AWSService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
public class BaseWebController {
    private final AWSService awsController;

    @RequestMapping("/")
    public ModelAndView onIndex() {
        if (awsController.isInitialized()) {
            return new ModelAndView("data.html");
        }
        return new ModelAndView("request_aws_key.html");
    }

    @RequestMapping("/server-error")
    public ModelAndView onErrorTest() {
        return new ModelAndView("error.html");
    }
}
