package dev.cyberspark.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.metrics.export.prometheus.EnablePrometheusMetrics;
import org.springframework.web.bind.annotation.RestController;
import io.micrometer.core.aop.TimedAspect;
import org.springframework.context.annotation.Bean;
import io.micrometer.core.instrument.MeterRegistry;
@SpringBootApplication
//@EnablePrometheusMetrics
@RestController
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }

    @Bean
    public TimedAspect timedAspect(MeterRegistry registry) {
        return new TimedAspect(registry);
    }

}
