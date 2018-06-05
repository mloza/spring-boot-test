package pl.mloza.services;

import org.springframework.stereotype.Component;

@Component
public class HelloService {

    public String getHello() {
        return "World";
    }
}
