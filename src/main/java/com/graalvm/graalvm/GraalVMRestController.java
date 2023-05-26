package com.graalvm.graalvm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Random;
import java.util.stream.Stream;

@RestController
public class GraalVMRestController {

    @GetMapping("/fetch-windspeed")
    public Flux<String> fetchWindSpeed() {
        Flux<Long> interval = Flux.interval(Duration.ofSeconds(1));
        Flux<String> events = Flux.fromStream(Stream.generate(this::getWindSpeed));
        return Flux.zip(events, interval, (key, value) -> key);
    }

    private String getWindSpeed() {
        String[] windSpeeds = "100 km/h,101 km/h,102 km/h, 103 km/h, 104 km/h " .split(", ");
        return windSpeeds[new Random().nextInt(windSpeeds.length)];
    }
}
