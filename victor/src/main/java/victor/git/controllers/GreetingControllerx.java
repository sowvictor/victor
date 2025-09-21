package victor.git.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import victor.git.model.Greeting;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingControllerx {

    private static final String template = "Hello , %s!";
    private final AtomicLong counter = new  AtomicLong();

            // http://localhost:8080/greeting?name=victor
            // http
    @RequestMapping("/greeting")
    public Greeting greeting(
            @RequestParam(value = "name",defaultValue = "world")
            String name){
        return new Greeting(counter.incrementAndGet(),String.format(template,name));



    }
}
