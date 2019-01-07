package api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

public class newClassController {

    @RequestMapping("/")
    public String test(){
        return "Spring boot is running cozy and warm";
    }
}