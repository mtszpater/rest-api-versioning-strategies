package dev.pater.app;

import org.springframework.stereotype.Component;

@Component
public class PostService {

    String getOne(int id, String version) {
        return "Version " + version + " of " + id;
    }
}
