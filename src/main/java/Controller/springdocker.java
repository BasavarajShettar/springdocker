package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class springdocker
{
    @GetMapping("/msg")
    public String msg()
    {
        return "WELCOME TO SPRING DOCKER DEMO";
    }
}
