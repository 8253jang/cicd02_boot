package web.mvc.cicd02_boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String index(){
        return ".github>workflows/deploy.yml CI/CD TEST중입니다.";
    }
}
