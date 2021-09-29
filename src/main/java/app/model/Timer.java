package app.model;

import org.springframework.stereotype.Component;

@Component   // На основе класса Timer создайте бин Свяжите с AnimalCage.

public class Timer {
    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}
