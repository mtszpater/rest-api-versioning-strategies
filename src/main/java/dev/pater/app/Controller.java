package dev.pater.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final PostService postService;

    @Autowired
    public Controller(PostService postService) {
        this.postService = postService;
    }

    @GetMapping(value = "posts/{id}", produces = "application/json;version=1")
    public String post1(@PathVariable int id) {
        return postService.getOne(id, "1.0");
    }

    @GetMapping(value = "posts/{id}", produces = "application/json;version=2")
    public String post2(@PathVariable int id) {
        return postService.getOne(id, "2.0");
    }
}
