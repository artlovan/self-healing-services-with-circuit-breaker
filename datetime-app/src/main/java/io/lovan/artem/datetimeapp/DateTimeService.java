package io.lovan.artem.datetimeapp;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DateTimeService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "unknown")
    public String getDateTime() {
        return restTemplate.getForEntity("http://datetime-service/time", String.class)
                .getBody();
    }

    public String unknown() {
        return "unknown";
    }
}
