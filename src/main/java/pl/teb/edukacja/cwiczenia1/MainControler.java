package pl.teb.edukacja.cwiczenia1;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MainControler {

    private static final String template = "Hello, %s";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "mame", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));

    }
}
