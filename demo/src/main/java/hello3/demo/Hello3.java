package hello3.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Hello3 {
    @GetMapping("hi")
    public String hi()
    {
        return "hiiiiii";
    }
    @GetMapping("hello")
    public String hello()
    {
        return "hello";
    }
    @GetMapping("lo")
    public String lo()
    {
        return "lo";
    }
    
}



