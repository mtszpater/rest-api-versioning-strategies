package dev.pater.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(value = "/", produces = "application/json;version=1")
    public String version1() {
        return "1.0";
    }

    @GetMapping(value = "/", produces = "application/json;version=2")
    public String version2() {
        return "2.0";
    }
}
