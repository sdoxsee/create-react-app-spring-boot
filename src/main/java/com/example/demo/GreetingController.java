package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/api/greeting")
    public List<Greeting> greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return Arrays.asList(
                new Greeting(counter.incrementAndGet(),
                            String.format(template, name)),
                new Greeting(counter.incrementAndGet(),
                            "A random entry"),
                new Greeting(counter.incrementAndGet(),
                            "Another random entry"),
                new Greeting(counter.incrementAndGet(),
                            String.format(template, name))
        );
    }
}