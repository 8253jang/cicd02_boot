package web.mvc.cicd02_boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String index(){
        return "Docker기반의 GitHub Actions를 이용한 SCP로  EC2 CI/CD TEST";
    }
}
