package com.qvestdigital.tforce.hispring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

// short for @Controller @ResponseBody
@RestController
public class GreetingController {
    private static final String TEMPLATE = "Hallo, %s!";
    private final AtomicLong counter = new AtomicLong();

    // short for @RequestMapping(method=GET)
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "Du") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(TEMPLATE, name));
    }
}
