package by.louegroove.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/home")
    public String home(){
        return "<h1>you are on the home page</h1>"+
                "<a href='/dashboard'>dashboard</a>";
    }
    @GetMapping("/dashboard")
    public String dashboard(){
        return "<h1> you are on the dashboard page</h1>" +
                "<a href='/home'>home</a>";
    }
}
