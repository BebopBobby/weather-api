package com.bobby.weatherapi.task;

import com.bobby.weatherapi.WeatherApiApplication;
import com.bobby.weatherapi.component.WeatherReport;
import com.bobby.weatherapi.pojos.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ScheduledMethod {
    private static final Logger log = LoggerFactory.getLogger(WeatherApiApplication.class);

    @Scheduled(fixedRate = 15000)
    public void printWeather() {
        RestTemplate restTemplate = new RestTemplate();
        WeatherReport weatherReport = restTemplate.getForObject("https://query.yahooapis.com/v1/public/yql?q=select item.condition from weather.forecast where woeid = 12765775&format=json&env=store://datatables.org/alltableswithkeys", WeatherReport.class);
        log.info(weatherReport.toString());
    }
}
