package model;

import org.springframework.stereotype.Component;

@Component
public class Singleton {
    public Singleton() {
        System.out.println("Singleton bean created");
    }
}
